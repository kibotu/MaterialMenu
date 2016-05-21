package net.kibotu.android.materialmenu;

import android.support.annotation.NonNull;

/**
 * Created by Nyaruhodo on 21.05.2016.
 */
public interface Configurator<T> {

    void configure(@NonNull final T t);
}
