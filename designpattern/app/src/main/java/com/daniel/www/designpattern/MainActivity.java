package com.daniel.www.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.daniel.www.factorymethod.common.SendFactory;
import com.daniel.www.factorymethod.common.Sender;

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


    private void factoryTest() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }

    @Override
    public void onItemListener(int position, String text) {

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }
}
