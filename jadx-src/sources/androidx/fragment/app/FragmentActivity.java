package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.loader.app.LoaderManager;
import androidx.view.ComponentActivity;
import androidx.view.Lifecycle;
import androidx.view.LifecycleRegistry;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.SavedStateRegistry;
import androidx.view.SavedStateRegistryOwner;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.contextaware.OnContextAvailableListener;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.ActivityResultRegistryOwner;
import com.safedk.android.utils.Logger;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        public void Ik() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void addOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void addOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void addOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void addOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean az(String str) {
            return ActivityCompat.xMQ(FragmentActivity.this, str);
        }

        @Override // androidx.view.result.ActivityResultRegistryOwner
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.view.LifecycleOwner
        /* JADX INFO: renamed from: getLifecycle */
        public Lifecycle getLifecycleRegistry() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.view.OnBackPressedDispatcherOwner
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.view.SavedStateRegistryOwner
        public SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.view.ViewModelStoreOwner
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public LayoutInflater gh() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void n(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean nr() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public FragmentActivity mUb() {
            return FragmentActivity.this;
        }

        @Override // androidx.core.view.MenuHost
        public void removeMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void removeOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void removeOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void removeOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public View t(int i2) {
            return FragmentActivity.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void xMQ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void ck() {
            Ik();
        }
    }

    public FragmentActivity() {
        this.mFragments = FragmentController.rl(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        dR0();
    }

    public static void safedk_FragmentActivity_startActivityFromFragment_dee2891e09a0991938bcd2569510a76c(FragmentActivity p0, Fragment p1, Intent p2, int p3, Bundle p4) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/FragmentActivity;->startActivityFromFragment(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p2 == null) {
            return;
        }
        p0.startActivityFromFragment(p1, p2, p3, p4);
    }

    public static void safedk_Fragment_startActivityForResult_d758cd3f553fe0e97f7fa264fc55ae09(Fragment p0, Intent p1, int p2, Bundle p3) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2, p3);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i2) {
        safedk_FragmentActivity_startActivityFromFragment_dee2891e09a0991938bcd2569510a76c(this, fragment, intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i2, @Nullable Intent intent, int i3, int i5, int i7, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 == -1) {
            ActivityCompat.gh(this, intentSender, i2, intent, i3, i5, i7, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i5, i7, bundle);
        }
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    @Nullable
    final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.ty(view, str, context, attributeSet);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.qie();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @CallSuper
    protected void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        this.mFragments.az();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.az();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.az();
        super.onResume();
        this.mResumed = true;
        this.mFragments.gh();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_RESUME);
        this.mFragments.KN();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.az();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.t();
        }
        this.mFragments.gh();
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_START);
        this.mFragments.xMQ();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.az();
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i2, @Nullable Bundle bundle) {
        if (i2 == -1) {
            ActivityCompat.mUb(this, intent, -1, bundle);
        } else {
            safedk_Fragment_startActivityForResult_d758cd3f553fe0e97f7fa264fc55ae09(fragment, intent, i2, bundle);
        }
    }

    public static /* synthetic */ Bundle Y(FragmentActivity fragmentActivity) {
        fragmentActivity.markFragmentsCreated();
        fragmentActivity.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    private void dR0() {
        getSavedStateRegistry().t(LIFECYCLE_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.o
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle n() {
                return FragmentActivity.Y(this.f38746n);
            }
        });
        addOnConfigurationChangedListener(new Consumer() { // from class: androidx.fragment.app.qz
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f38747n.mFragments.az();
            }
        });
        addOnNewIntentListener(new Consumer() { // from class: androidx.fragment.app.Pl
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f38710n.mFragments.az();
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.Xo
            @Override // androidx.view.contextaware.OnContextAvailableListener
            public final void n(Context context) {
                this.f38735n.mFragments.n(null);
            }
        });
    }

    private static boolean z(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z2 = false;
        for (Fragment fragment : fragmentManager.Po6()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z2 |= z(fragment.getChildFragmentManager(), state);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null && fragmentViewLifecycleOwner.getLifecycleRegistry().getState().rl(Lifecycle.State.J2)) {
                    fragment.mViewLifecycleOwner.J2(state);
                    z2 = true;
                }
                if (fragment.mLifecycleRegistry.getState().rl(Lifecycle.State.J2)) {
                    fragment.mLifecycleRegistry.ty(state);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            LoaderManager.rl(this).n(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.qie().I(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.rl(this);
    }

    void markFragmentsCreated() {
        while (z(getSupportFragmentManager(), Lifecycle.State.f38880O)) {
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_CREATE);
        this.mFragments.O();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.J2();
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return this.mFragments.nr(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.Uo();
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.mUb();
        this.mFragmentLifecycleRegistry.xMQ(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.Uo(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.KN(this, sharedElementCallback);
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.t(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.nr(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.qie(this);
    }

    public FragmentActivity(int i2) {
        super(i2);
        this.mFragments = FragmentController.rl(new HostCallbacks());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        dR0();
    }
}
