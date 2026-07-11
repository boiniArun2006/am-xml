package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SparseArrayCompat;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.view.LifecycleOwner;
import androidx.view.MutableLiveData;
import androidx.view.Observer;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class LoaderManagerImpl extends LoaderManager {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static boolean f39090t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LifecycleOwner f39091n;
    private final LoaderViewModel rl;

    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        private LifecycleOwner HI;
        private Loader Ik;
        private final Bundle az;
        private LoaderObserver ck;
        private final int qie;
        private final Loader ty;

        Loader Ik(boolean z2) {
            if (LoaderManagerImpl.f39090t) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.ty.cancelLoad();
            this.ty.abandon();
            LoaderObserver loaderObserver = this.ck;
            if (loaderObserver != null) {
                HI(loaderObserver);
                if (z2) {
                    loaderObserver.t();
                }
            }
            this.ty.unregisterListener(this);
            if ((loaderObserver == null || loaderObserver.rl()) && !z2) {
                return this.ty;
            }
            this.ty.reset();
            return this.Ik;
        }

        Loader XQ(LifecycleOwner lifecycleOwner, LoaderManager.LoaderCallbacks loaderCallbacks) {
            LoaderObserver loaderObserver = new LoaderObserver(this.ty, loaderCallbacks);
            mUb(lifecycleOwner, loaderObserver);
            LoaderObserver loaderObserver2 = this.ck;
            if (loaderObserver2 != null) {
                HI(loaderObserver2);
            }
            this.HI = lifecycleOwner;
            this.ck = loaderObserver;
            return this.ty;
        }

        void Z() {
            LifecycleOwner lifecycleOwner = this.HI;
            LoaderObserver loaderObserver = this.ck;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.HI(loaderObserver);
            mUb(lifecycleOwner, loaderObserver);
        }

        @Override // androidx.view.LiveData
        protected void az() {
            if (LoaderManagerImpl.f39090t) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.ty.stopLoading();
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void n(Loader loader, Object obj) {
            if (LoaderManagerImpl.f39090t) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ck(obj);
                return;
            }
            if (LoaderManagerImpl.f39090t) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            ty(obj);
        }

        Loader o() {
            return this.ty;
        }

        @Override // androidx.view.LiveData
        protected void qie() {
            if (LoaderManagerImpl.f39090t) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.ty.startLoading();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.qie);
            sb.append(" : ");
            Class<?> cls = this.ty.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        LoaderInfo(int i2, Bundle bundle, Loader loader, Loader loader2) {
            this.qie = i2;
            this.az = bundle;
            this.ty = loader;
            this.Ik = loader2;
            loader.registerListener(i2, this);
        }

        @Override // androidx.view.LiveData
        public void HI(Observer observer) {
            super.HI(observer);
            this.HI = null;
            this.ck = null;
        }

        @Override // androidx.view.MutableLiveData, androidx.view.LiveData
        public void ck(Object obj) {
            super.ck(obj);
            Loader loader = this.Ik;
            if (loader != null) {
                loader.reset();
                this.Ik = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.qie);
            printWriter.print(" mArgs=");
            printWriter.println(this.az);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.ty);
            this.ty.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.ck != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.ck);
                this.ck.n(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(o().dataToString(J2()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(KN());
        }
    }

    static class LoaderObserver<D> implements Observer<D> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f39092O = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Loader f39093n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final LoaderManager.LoaderCallbacks f39094t;

        @Override // androidx.view.Observer
        public void onChanged(Object obj) {
            if (LoaderManagerImpl.f39090t) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f39093n + ": " + this.f39093n.dataToString(obj));
            }
            this.f39092O = true;
            this.f39094t.onLoadFinished(this.f39093n, obj);
        }

        boolean rl() {
            return this.f39092O;
        }

        void t() {
            if (this.f39092O) {
                if (LoaderManagerImpl.f39090t) {
                    Log.v("LoaderManager", "  Resetting: " + this.f39093n);
                }
                this.f39094t.onLoaderReset(this.f39093n);
            }
        }

        public String toString() {
            return this.f39094t.toString();
        }

        LoaderObserver(Loader loader, LoaderManager.LoaderCallbacks loaderCallbacks) {
            this.f39093n = loader;
            this.f39094t = loaderCallbacks;
        }

        public void n(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f39092O);
        }
    }

    static class LoaderViewModel extends ViewModel {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final ViewModelProvider.Factory f39095t = new ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class cls) {
                return new LoaderViewModel();
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SparseArrayCompat f39096n = new SparseArrayCompat();
        private boolean rl = false;

        void t() {
            this.rl = false;
        }

        void xMQ() {
            this.rl = true;
        }

        static LoaderViewModel nr(ViewModelStore viewModelStore) {
            return (LoaderViewModel) new ViewModelProvider(viewModelStore, f39095t).n(LoaderViewModel.class);
        }

        boolean J2() {
            return this.rl;
        }

        void KN(int i2, LoaderInfo loaderInfo) {
            this.f39096n.az(i2, loaderInfo);
        }

        LoaderInfo O(int i2) {
            return (LoaderInfo) this.f39096n.O(i2);
        }

        void Uo() {
            int iCk = this.f39096n.ck();
            for (int i2 = 0; i2 < iCk; i2++) {
                ((LoaderInfo) this.f39096n.Ik(i2)).Z();
            }
        }

        public void rl(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f39096n.ck() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f39096n.ck(); i2++) {
                    LoaderInfo loaderInfo = (LoaderInfo) this.f39096n.Ik(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f39096n.qie(i2));
                    printWriter.print(": ");
                    printWriter.println(loaderInfo.toString());
                    loaderInfo.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        LoaderViewModel() {
        }

        @Override // androidx.view.ViewModel
        protected void onCleared() {
            super.onCleared();
            int iCk = this.f39096n.ck();
            for (int i2 = 0; i2 < iCk; i2++) {
                ((LoaderInfo) this.f39096n.Ik(i2)).Ik(true);
            }
            this.f39096n.rl();
        }
    }

    private Loader O(int i2, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks, Loader loader) {
        try {
            this.rl.xMQ();
            Loader loaderOnCreateLoader = loaderCallbacks.onCreateLoader(i2, bundle);
            if (loaderOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (loaderOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(loaderOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + loaderOnCreateLoader);
            }
            LoaderInfo loaderInfo = new LoaderInfo(i2, bundle, loaderOnCreateLoader, loader);
            if (f39090t) {
                Log.v("LoaderManager", "  Created new loader " + loaderInfo);
            }
            this.rl.KN(i2, loaderInfo);
            this.rl.t();
            return loaderInfo.XQ(this.f39091n, loaderCallbacks);
        } catch (Throwable th) {
            this.rl.t();
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.rl.rl(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    public void nr() {
        this.rl.Uo();
    }

    @Override // androidx.loader.app.LoaderManager
    public Loader t(int i2, Bundle bundle, LoaderManager.LoaderCallbacks loaderCallbacks) {
        if (this.rl.J2()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        LoaderInfo loaderInfoO = this.rl.O(i2);
        if (f39090t) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (loaderInfoO == null) {
            return O(i2, bundle, loaderCallbacks, null);
        }
        if (f39090t) {
            Log.v("LoaderManager", "  Re-using existing loader " + loaderInfoO);
        }
        return loaderInfoO.XQ(this.f39091n, loaderCallbacks);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f39091n.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f39091n = lifecycleOwner;
        this.rl = LoaderViewModel.nr(viewModelStore);
    }
}
