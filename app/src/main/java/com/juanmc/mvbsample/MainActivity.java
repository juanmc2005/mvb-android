package com.juanmc.mvbsample;

import android.os.Bundle;
import android.widget.Toast;

import com.devsar.android.ucbindings.bindings.Binding;
import com.devsar.android.ucbindings.bindings.BindingBuilder;
import com.juanmc.mvb.MVBActivity;
import com.juanmc.mvb.MVBView;
import com.juanmc.mvb.ViewModel;

public class MainActivity extends MVBActivity implements MVBView {

    private MainViewModel viewModel;
    private Binding someBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new MainViewModel(this);
        someBinding = new BindingBuilder<>(viewModel.useCase.provider())
                .onNext(str -> Toast.makeText(this, str, Toast.LENGTH_LONG).show())
                .onError(error -> Toast.makeText(this, error.getMessage(), Toast.LENGTH_LONG).show())
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.startUseCase(10);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.detachView();
    }

    @Override
    protected ViewModel<?> getViewModel() {
        return viewModel;
    }

    @Override
    protected Binding[] getBindings() {
        return new Binding[] {someBinding};
    }
}
