package com.codermrye.day4;

import com.codermrye.day4.ResourceTable;
import com.codermrye.day4.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.ability.AbilityForm;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }

    @Override
    public AbilityForm onCreateForm() {
        return new AbilityForm(ResourceTable.Layout_ability_main, this);
    }
}
