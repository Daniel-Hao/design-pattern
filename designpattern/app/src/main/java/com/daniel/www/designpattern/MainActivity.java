package com.daniel.www.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.Toast;

import com.daniel.www.abstractfactory.Provider;
import com.daniel.www.abstractfactory.SendSmsFactory;
import com.daniel.www.adapter.classs.Adapter;
import com.daniel.www.adapter.objects.Wrapper1;
import com.daniel.www.bridge.Bridge;
import com.daniel.www.bridge.MyBridge;
import com.daniel.www.builder.Builder;
import com.daniel.www.composite.Tree;
import com.daniel.www.composite.TreeNode;
import com.daniel.www.decorator.Decorator;
import com.daniel.www.facade.Computer;
import com.daniel.www.factorymethod.common.SendCommonFactory;
import com.daniel.www.factorymethod.more.SendMoreFactory;
import com.daniel.www.factorymethod.statics.SendStaticFactory;
import com.daniel.www.proxy.Proxy;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DesignAdapter.OnItemListener {

    private RecyclerView mRv;
    private List<String> mDatas;
    private DesignAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRv = (RecyclerView) findViewById(R.id.rv);

        initData();
        mAdapter = new DesignAdapter(this, mDatas);
        mAdapter.setOnItemClicked(this);

        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(mAdapter);


    }

    private void initData() {
        mDatas = new ArrayList<>();
        mDatas.add("0.Factory Method 普通工厂模式");
        mDatas.add("1.Factory Method 多个工厂方法模式");
        mDatas.add("2.Factory Method 静态工厂方法模式");
        mDatas.add("3.Abstract Factory 抽象工厂模式");
        mDatas.add("4.Singleton 单例模式");
        mDatas.add("5.Builder 建造者模式");
        mDatas.add("6.Prototype 原型模式");
        mDatas.add("7.Adapter 类的适配器模式");
        mDatas.add("8.Adapter 对象的适配器模式");
        mDatas.add("9.Adapter 接口的适配器模式");
        mDatas.add("10.Decorator 装饰模式");
        mDatas.add("11.Proxy 代理模式");
        mDatas.add("12.Facade 外观模式");
        mDatas.add("13.Bridge 桥接模式");
        mDatas.add("14.Composite 组合模式");
        mDatas.add("15.Flyweight 享元模式");
        mDatas.add("16.Strategy 策略模式");
        mDatas.add("17.Template Method 模板方法模式");
        mDatas.add("18.Observer 观察者模式");
        mDatas.add("19.Iterators 迭代子模式");
        mDatas.add("20.Chain of Responsibility 责任链模式");
        mDatas.add("21.Command 命令模式");
        mDatas.add("22.Memento 备忘录模式");
        mDatas.add("23.State 状态模式");
        mDatas.add("24.Visitor 访问者模式");
        mDatas.add("25.Mediator 中介者模式");
        mDatas.add("26.Interpreter 解释器模式");
    }

    //region 私有方法
    private void factoryCommonTest() {
        SendCommonFactory factory = new SendCommonFactory();
        com.daniel.www.factorymethod.Sender sender = factory.produce("sms");
        sender.send();
    }

    private void factoryMoreTest() {
        SendMoreFactory factory = new SendMoreFactory();
        com.daniel.www.factorymethod.Sender sender = factory.produceMail();
        sender.send();
    }

    private void factoryStaticTest() {
        com.daniel.www.factorymethod.Sender sender = SendStaticFactory.produceMail();
        sender.send();
    }

    private void abstractFactoryTest() {
        Provider provider = new SendSmsFactory();
        com.daniel.www.abstractfactory.Sender sender = provider.produce();
        sender.send();
    }

    private void builderTest() {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }

    private void adapterClassTest() {
        com.daniel.www.adapter.classs.Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    private void adapterObjectTest() {
        com.daniel.www.adapter.objects.Source source = new com.daniel.www.adapter.objects.Source();
        com.daniel.www.adapter.objects.Targetable target = new Wrapper1(source);
        target.method1();
        target.method2();
    }

    private void adapterInterfaceTest() {
        com.daniel.www.adapter.interfaces.Sourceable source1 = new com.daniel.www.adapter.interfaces.SourceSub1();
        com.daniel.www.adapter.interfaces.Sourceable source2 = new com.daniel.www.adapter.interfaces.SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }

    private void decoratorTest() {
        com.daniel.www.decorator.Sourceable source = new com.daniel.www.decorator.Source();
        com.daniel.www.decorator.Sourceable obj = new Decorator(source);
        obj.method();
    }

    private void proxyTest() {
        com.daniel.www.proxy.Sourceable source = new Proxy();
        source.method();
    }

    private void facadeTest() {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

    private void briageTest() {
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        com.daniel.www.bridge.Sourceable source1 = new com.daniel.www.bridge.SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        com.daniel.www.bridge.Sourceable source2 = new com.daniel.www.bridge.SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }

    private void compositeTest() {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }

    private void strategyTest() {
        String exp = "2+8";
        com.daniel.www.strategy.ICalculator cal = new com.daniel.www.strategy.Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }

    private void templatemethodTest() {
        String exp = "8+8";
        com.daniel.www.templatemethod.AbstractCalculator cal = new com.daniel.www.templatemethod.Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }

    private void ObserverTest() {

        com.daniel.www.observer.Subject sub = new com.daniel.www.observer.MySubject();
        sub.add(new com.daniel.www.observer.Observer1());
        sub.add(new com.daniel.www.observer.Observer2());
        sub.operation();
    }

    private void iteratorTest() {
        com.daniel.www.iterator.Collections collection = new com.daniel.www.iterator.MyCollection();
        com.daniel.www.iterator.Iterators it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private void chainofresponsibilityTest() {
        com.daniel.www.chainofresponsibility.MyHandler h1 = new com.daniel.www.chainofresponsibility.MyHandler("h1");
        com.daniel.www.chainofresponsibility.MyHandler h2 = new com.daniel.www.chainofresponsibility.MyHandler("h2");
        com.daniel.www.chainofresponsibility.MyHandler h3 = new com.daniel.www.chainofresponsibility.MyHandler("h3");
        h1.setHandler(h2);
        h2.setHandler(h3);
        h1.operator();
    }

    private void commandTest() {
        com.daniel.www.command.Receiver receiver = new com.daniel.www.command.Receiver();
        com.daniel.www.command.Command cmd = new com.daniel.www.command.MyCommand(receiver);
        com.daniel.www.command.Invoker invoker = new com.daniel.www.command.Invoker(cmd);
        invoker.action();
    }

    private void mementoTest() {
        // 创建原始类
        com.daniel.www.memento.Original origi = new com.daniel.www.memento.Original("egg");

        // 创建备忘录
        com.daniel.www.memento.Storage storage = new com.daniel.www.memento.Storage(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为：" + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为：" + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + origi.getValue());
    }


    private void stateTest() {
        com.daniel.www.state.State state = new com.daniel.www.state.State();
        com.daniel.www.state.Contexts context = new com.daniel.www.state.Contexts(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }

    private void visitorTest() {
        com.daniel.www.visitor.Visitor visitor = new com.daniel.www.visitor.MyVisitor();
        com.daniel.www.visitor.Subjects sub = new com.daniel.www.visitor.MySubject();
        sub.accept(visitor);
    }

    private void mediatorTest(){
        com.daniel.www.mediator.Mediator mediator = new com.daniel.www.mediator.MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
    //endregion

    //region接口
    @Override
    public void onItemListener(int position, String text) {
        if (TextUtils.isEmpty(text)) {
            Toast.makeText(this, "点击数据为空", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        }

        if (mDatas != null && mDatas.size() > 0) {
            for (int i = 0; i < mDatas.size(); i++) {
                if (mDatas.get(0).equals(text)) {
                    factoryCommonTest();
                    break;
                } else if (mDatas.get(1).equals(text)) {
                    factoryMoreTest();
                    break;
                } else if (mDatas.get(2).equals(text)) {
                    factoryStaticTest();
                    break;
                } else if (mDatas.get(3).equals(text)) {
                    abstractFactoryTest();
                    break;
                } else if (mDatas.get(4).equals(text)) {

                    break;
                } else if (mDatas.get(5).equals(text)) {
                    builderTest();
                    break;
                } else if (mDatas.get(6).equals(text)) {

                    break;
                } else if (mDatas.get(7).equals(text)) {
                    adapterClassTest();
                    break;
                } else if (mDatas.get(8).equals(text)) {
                    adapterObjectTest();
                    break;
                } else if (mDatas.get(9).equals(text)) {
                    adapterInterfaceTest();
                    break;
                } else if (mDatas.get(10).equals(text)) {
                    decoratorTest();
                    break;
                } else if (mDatas.get(11).equals(text)) {
                    proxyTest();
                    break;
                } else if (mDatas.get(12).equals(text)) {
                    facadeTest();
                    break;
                } else if (mDatas.get(13).equals(text)) {
                    briageTest();
                    break;
                } else if (mDatas.get(14).equals(text)) {
                    compositeTest();
                    break;
                } else if (mDatas.get(15).equals(text)) {

                    break;
                } else if (mDatas.get(16).equals(text)) {
                    strategyTest();
                    break;
                } else if (mDatas.get(17).equals(text)) {
                    templatemethodTest();
                    break;
                } else if (mDatas.get(18).equals(text)) {
                    ObserverTest();
                    break;
                } else if (mDatas.get(19).equals(text)) {
                    iteratorTest();
                    break;
                } else if (mDatas.get(20).equals(text)) {
                    chainofresponsibilityTest();
                    break;
                } else if (mDatas.get(21).equals(text)) {
                    commandTest();
                    break;
                } else if (mDatas.get(22).equals(text)) {
                    mementoTest();
                    break;
                } else if (mDatas.get(23).equals(text)) {
                    stateTest();
                    break;
                } else if (mDatas.get(24).equals(text)) {
                    visitorTest();
                    break;
                } else if (mDatas.get(25).equals(text)) {
                    mediatorTest();
                    break;
                } else if (mDatas.get(26).equals(text)) {

                    break;
                }
            }
        }
    }
    //endregion

}
