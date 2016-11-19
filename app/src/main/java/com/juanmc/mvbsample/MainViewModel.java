package com.juanmc.mvbsample;

import com.juanmc.mvb.MVBView;
import com.juanmc.mvb.usecases.UseCase;
import com.juanmc.mvb.ViewModel;
import com.juanmc.mvb.usecases.UseCaseFactory;


/**
 * Created by juanma on 18/11/16.
 */

public class MainViewModel extends ViewModel<MVBView> {

    private final SomeService service = new SomeService();
    public final UseCase<String> useCase;

    public MainViewModel(MVBView view) {
        super(view);
        useCase = UseCaseFactory.lastOnly();
    }

    public void startUseCase(Integer x) {
        useCase.run(service.someNetworkService(x));
    }

    @Override
    protected UseCase[] getUseCases() {
        return new UseCase[] {useCase};
    }
}
