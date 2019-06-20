package com.elektra.daggerpractise.di;

import androidx.lifecycle.ViewModelProvider;

import com.elektra.daggerpractise.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);
}
