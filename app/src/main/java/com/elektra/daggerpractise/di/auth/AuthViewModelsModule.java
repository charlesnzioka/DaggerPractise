package com.elektra.daggerpractise.di.auth;

import androidx.lifecycle.ViewModel;

import com.elektra.daggerpractise.di.ViewModelKey;
import com.elektra.daggerpractise.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
