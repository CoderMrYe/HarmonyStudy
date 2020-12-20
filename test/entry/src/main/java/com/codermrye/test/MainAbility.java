package com.codermrye.test;

import com.codermrye.test.slice.MainAbilitySlice;
import com.codermrye.test.slice.ProductDetailsSlice;
import com.codermrye.test.slice.ShareAbilitySlice;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        addActionRoute("action.system.detail", ProductDetailsSlice.class.getName());
        addActionRoute("action.system.share", ShareAbilitySlice.class.getName());
    }
}
