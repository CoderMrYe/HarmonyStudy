package com.codermrye.day3.slice;

import com.codermrye.day3.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.element.ShapeElement;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        // 加载XML布局作为根布局
        super.setUIContent(ResourceTable.Layout_ability_main);
        // 查找布局中组件
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        if (button != null) {
            // 设置组件的属性
            ShapeElement background = new ShapeElement();
            background.setRgbColor(new RgbColor(0,125,255));
            background.setCornerRadius(25);
            button.setBackground(background);

            button.setClickedListener(new Component.ClickedListener() {
                @Override
                // 在组件中增加对点击事件的检测
                public void onClick(Component Component) {
                    // 此处添加按钮被点击需要执行的操作
                }
            });
        }
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
