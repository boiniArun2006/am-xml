package androidx.loader.app;

import android.os.Bundle;
import androidx.loader.content.Loader;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class LoaderManager {

    public interface LoaderCallbacks<D> {
        Loader onCreateLoader(int i2, Bundle bundle);

        void onLoadFinished(Loader loader, Object obj);

        void onLoaderReset(Loader loader);
    }

    public abstract void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void nr();

    public abstract Loader t(int i2, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public static LoaderManager rl(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }
}
