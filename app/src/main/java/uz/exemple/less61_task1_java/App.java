package uz.exemple.less61_task1_java;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import timber.log.Timber;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree(){
            @Override
            protected void log(int priority, String tag, @NonNull String message, Throwable t) {
                super.log(priority, "advanced_"+tag, message, t);
            }

            @Nullable
            @Override
            protected String createStackElementTag(@NonNull StackTraceElement element) {
                return String.format(
                        "%s:%s=>%s",
                        element.getMethodName(),
                        element.getLineNumber(),
                        super.createStackElementTag(element)
                );
            }
        });
    }
}
