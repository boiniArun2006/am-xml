package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import androidx.view.DefaultLifecycleObserver;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    @RequiresApi
    static class BackgroundDefaultConfig extends EmojiCompat.Config {
        protected BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            rl(1);
        }
    }

    @RequiresApi
    static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f38326n;

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void n(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor threadPoolExecutorRl = ConcurrencyHelpers.rl("EmojiCompatInitializer");
            threadPoolExecutorRl.execute(new Runnable() { // from class: androidx.emoji2.text.w6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38394n.t(metadataRepoLoaderCallback, threadPoolExecutorRl);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void t(final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, final ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigN = DefaultEmojiCompatConfig.n(this.f38326n);
                if (fontRequestEmojiCompatConfigN == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                fontRequestEmojiCompatConfigN.t(threadPoolExecutor);
                fontRequestEmojiCompatConfigN.n().n(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void n(Throwable th) {
                        try {
                            metadataRepoLoaderCallback.n(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void rl(MetadataRepo metadataRepo) {
                        try {
                            metadataRepoLoaderCallback.rl(metadataRepo);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
            } catch (Throwable th) {
                metadataRepoLoaderCallback.n(th);
                threadPoolExecutor.shutdown();
            }
        }

        BackgroundDefaultLoader(Context context) {
            this.f38326n = context.getApplicationContext();
        }
    }

    static class LoadEmojiCompatRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                TraceCompat.n("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.gh()) {
                    EmojiCompat.t().ty();
                }
            } finally {
                TraceCompat.rl();
            }
        }

        LoadEmojiCompatRunnable() {
        }
    }

    @Override // androidx.startup.Initializer
    public List n() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // androidx.startup.Initializer
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        EmojiCompat.mUb(new BackgroundDefaultConfig(context));
        t(context);
        return Boolean.TRUE;
    }

    void nr() {
        ConcurrencyHelpers.t().postDelayed(new LoadEmojiCompatRunnable(), 500L);
    }

    void t(Context context) {
        final Lifecycle lifecycleRegistry = ((LifecycleOwner) AppInitializer.O(context).J2(ProcessLifecycleInitializer.class)).getLifecycleRegistry();
        lifecycleRegistry.n(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.view.DefaultLifecycleObserver
            public void jB(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.nr();
                lifecycleRegistry.nr(this);
            }
        });
    }
}
