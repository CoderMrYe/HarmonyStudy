package com.codermrye.day2.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.*;
import ohos.agp.components.element.Element;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.LayoutAlignment;
import ohos.global.resource.NotExistException;
import ohos.global.resource.WrongTypeException;
import ohos.global.resource.solidxml.Pattern;
import ohos.global.resource.solidxml.Theme;
import ohos.media.image.ImageSource;

import java.io.IOException;
import java.text.Format;
import java.util.ArrayList;
import java.util.Random;

public class MainAbilitySlice extends AbilitySlice {
    private ArrayList<String> sentences = new ArrayList<>();
    private Random random = new Random();

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        //准备工作:变量初始化
        sentences.add("半辈子挣了两个亿 一个失忆一个回忆。");
        sentences.add("锄禾日当午 作图好辛苦  上午刚做完 还要一下午  加油打工人");
        sentences.add("打工人擦干你的泪水 因为这样骑电动车很危险。");
        sentences.add("干不完的活 跑不完的市场 睡不够的觉 买不起的貂");
        sentences.add("加油！打工人");
        sentences.add("加油！共享单车打工人");
        sentences.add("坚持住马上就发工资了");
        sentences.add("今日城里不努力 明日回村掰苞米");
        sentences.add("今天搬砖不狠 明天地位不稳");
        sentences.add("累吗 累就对了 舒服是留给有钱人的");
        sentences.add("世上有两种最耀眼的光芒 一种是太阳一种是我们努力工作的模样");
        sentences.add("同是天涯打工人，相逢何必曾相识");
        sentences.add("我的心里只有一件事就是工作");
        sentences.add("我是自愿来上班的 加油打工人");
        sentences.add("我要悄悄打工，然后惊艳所有人");
        sentences.add("在天愿做比翼鸟 在地愿做打工人");
        sentences.add("这么不努力，怎么做打工人啊你");
        sentences.add("只要我努力打工就可以有钱回家养老");
        sentences.add("只要我努力的打工 人类一定会走向更美好的未来。");
        sentences.add("只要我足够的努力 老板就能过上更好的生活。");

        // 步骤1 声明布局
        DirectionalLayout directionalLayout = new DirectionalLayout(getContext());
        // 步骤2 设置布局大小
        directionalLayout.setWidth(ComponentContainer.LayoutConfig.MATCH_PARENT);
        directionalLayout.setHeight(ComponentContainer.LayoutConfig.MATCH_PARENT);
        // 步骤3 设置布局属性及ID（ID视需要设置即可）
        directionalLayout.setOrientation(Component.VERTICAL);
        directionalLayout.setPadding(32, 32, 32, 32);

        Text text = new Text(getContext());
        text.setText("？？？");
        text.setTextSize(50);
        text.setId(100);
        // 步骤4.1 为组件添加对应布局的布局属性
        DirectionalLayout.LayoutConfig layoutConfig = new DirectionalLayout.LayoutConfig(DirectionalLayout.LayoutConfig.MATCH_CONTENT,
                DirectionalLayout.LayoutConfig.MATCH_CONTENT);
        layoutConfig.alignment = LayoutAlignment.HORIZONTAL_CENTER;
        text.setLayoutConfig(layoutConfig);

        // 步骤4.2 将Text添加到布局中
        directionalLayout.addComponent(text);

        // 类似的添加一个Button
        Button button = new Button(getContext());
        layoutConfig.setMargins(0, 50, 0, 0);
        button.setLayoutConfig(layoutConfig);
        button.setText("早安！打工人");
        button.setTextSize(50);
        button.setId(100);
        ShapeElement background = new ShapeElement();
        background.setRgbColor(new RgbColor(0, 125, 255));
        background.setCornerRadius(25);
        button.setBackground(background);
        button.setPadding(10, 10, 10, 10);
        button.setClickedListener(new Component.ClickedListener() {
            @Override
            // 在组件中增加对点击事件的检测
            public void onClick(Component Component) {
                // 此处添加按钮被点击需要执行的操作
                text.setText(sentences.get(random.nextInt(sentences.size())));
            }
        });
        directionalLayout.addComponent(button);

        // 步骤5 将布局作为根布局添加到视图树中
        super.setUIContent(directionalLayout);
    }



    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}