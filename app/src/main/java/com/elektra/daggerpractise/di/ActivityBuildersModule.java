package com.elektra.daggerpractise.di;

import com.elektra.daggerpractise.di.auth.AuthModule;
import com.elektra.daggerpractise.di.auth.AuthViewModelsModule;
import com.elektra.daggerpractise.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class,
            }
    )
    abstract AuthActivity contributeAuthActivity();
}
