package com.daniel.www.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
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

    //region 私有方法
    private void factoryTest() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
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

                } else if (mDatas.get(1).equals(text)) {

                } else if (mDatas.get(2).equals(text)) {

                } else if (mDatas.get(3).equals(text)) {

                } else if (mDatas.get(4).equals(text)) {

                } else if (mDatas.get(5).equals(text)) {

                } else if (mDatas.get(6).equals(text)) {

                } else if (mDatas.get(7).equals(text)) {

                } else if (mDatas.get(8).equals(text)) {

                } else if (mDatas.get(9).equals(text)) {

                } else if (mDatas.get(10).equals(text)) {

                } else if (mDatas.get(11).equals(text)) {

                } else if (mDatas.get(12).equals(text)) {

                } else if (mDatas.get(13).equals(text)) {

                } else if (mDatas.get(14).equals(text)) {

                } else if (mDatas.get(15).equals(text)) {

                } else if (mDatas.get(16).equals(text)) {

                } else if (mDatas.get(17).equals(text)) {

                } else if (mDatas.get(18).equals(text)) {

                } else if (mDatas.get(19).equals(text)) {

                } else if (mDatas.get(20).equals(text)) {

                } else if (mDatas.get(21).equals(text)) {

                } else if (mDatas.get(22).equals(text)) {

                } else if (mDatas.get(23).equals(text)) {

                } else if (mDatas.get(24).equals(text)) {

                } else if (mDatas.get(25).equals(text)) {

                } else if (mDatas.get(26).equals(text)) {

                } else if (mDatas.get(27).equals(text)) {

                }
            }
        }
    }
    //endregion

}
