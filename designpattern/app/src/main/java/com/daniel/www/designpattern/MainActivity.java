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
        mDatas.add("Factory Method 普通工厂模式");
        mDatas.add("Factory Method 多个工厂方法模式");
        mDatas.add("Factory Method 静态工厂方法模式");
        mDatas.add("Abstract Factory 抽象工厂模式");
        mDatas.add("Singleton 单例模式");
        mDatas.add("Builder 建造者模式");
        mDatas.add("Prototype 原型模式");
        mDatas.add("Adapter 类的适配器模式");
        mDatas.add("Adapter 对象的适配器模式");
        mDatas.add("Adapter 接口的适配器模式");
        mDatas.add("Decorator 装饰模式");
        mDatas.add("Proxy 代理模式");
        mDatas.add("Facade 外观模式");
        mDatas.add("Bridge 桥接模式");
        mDatas.add("Composite 组合模式");
        mDatas.add("Flyweight 享元模式");
        mDatas.add("Strategy 策略模式");
        mDatas.add("Template Method 模板方法模式");
        mDatas.add("Observer 观察者模式");
        mDatas.add("Iterator 迭代子模式");
        mDatas.add("Chain of Responsibility 责任链模式");
        mDatas.add("Command 命令模式");
        mDatas.add("Memento 备忘录模式");
        mDatas.add("State 状态模式");
        mDatas.add("Visitor 访问者模式");
        mDatas.add("Mediator 中介者模式");
        mDatas.add("Interpreter 解释器模式");
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

    private void abstractFactoryTest(){
        Provider provider = new SendSmsFactory();
        com.daniel.www.abstractfactory.Sender sender = provider.produce();
        sender.send();
    }

    private void builderTest(){
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }

    private void adapterClassTest(){
        com.daniel.www.adapter.classs.Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    private void adapterObjectTest(){
        com.daniel.www.adapter.objects.Source source = new com.daniel.www.adapter.objects.Source();
        com.daniel.www.adapter.objects.Targetable target = new Wrapper1(source);
        target.method1();
        target.method2();
    }

    private void adapterInterfaceTest(){
        com.daniel.www.adapter.interfaces.Sourceable source1 = new com.daniel.www.adapter.interfaces.SourceSub1();
        com.daniel.www.adapter.interfaces.Sourceable source2 = new com.daniel.www.adapter.interfaces.SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }

    private void decoratorTest(){
        com.daniel.www.decorator.Sourceable source = new com.daniel.www.decorator.Source();
        com.daniel.www.decorator.Sourceable obj = new Decorator(source);
        obj.method();
    }

    private void proxyTest(){
        com.daniel.www.proxy.Sourceable source = new Proxy();
        source.method();
    }

    private void facadeTest(){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

    private void briageTest(){
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

    private void compositeTest(){
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
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

                    break;
                } else if (mDatas.get(17).equals(text)) {

                    break;
                } else if (mDatas.get(18).equals(text)) {

                    break;
                } else if (mDatas.get(19).equals(text)) {

                    break;
                } else if (mDatas.get(20).equals(text)) {

                    break;
                } else if (mDatas.get(21).equals(text)) {

                    break;
                } else if (mDatas.get(22).equals(text)) {

                    break;
                } else if (mDatas.get(23).equals(text)) {

                    break;
                } else if (mDatas.get(24).equals(text)) {

                    break;
                } else if (mDatas.get(25).equals(text)) {

                    break;
                } else if (mDatas.get(26).equals(text)) {

                    break;
                } else if (mDatas.get(27).equals(text)) {

                    break;
                }
            }
        }
    }
    //endregion

}
