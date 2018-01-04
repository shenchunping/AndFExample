package com.we.scp.andframe;

import dagger.Component;

/**
 * Created by shenchunping on 2017/12/6.
 */

@Component(modules = AppModule.class)
public interface AppComponent {

    Api getApi();
}
