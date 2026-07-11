package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper gh = new FontProviderHelper();

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f38343n;
        private long rl;

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long n() {
            if (this.rl == 0) {
                this.rl = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.rl;
            if (jUptimeMillis > this.f38343n) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), this.f38343n - jUptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private Executor J2;
        private RetryPolicy KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Handler f38344O;
        private ThreadPoolExecutor Uo;
        private Runnable gh;
        private ContentObserver mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f38345n;
        private final Object nr = new Object();
        private final FontRequest rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final FontProviderHelper f38346t;
        EmojiCompat.MetadataRepoLoaderCallback xMQ;

        private void J2(Uri uri, long j2) {
            synchronized (this.nr) {
                try {
                    Handler handlerT = this.f38344O;
                    if (handlerT == null) {
                        handlerT = ConcurrencyHelpers.t();
                        this.f38344O = handlerT;
                    }
                    if (this.mUb == null) {
                        ContentObserver contentObserver = new ContentObserver(handlerT) { // from class: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1
                            @Override // android.database.ContentObserver
                            public void onChange(boolean z2, Uri uri2) {
                                FontRequestMetadataLoader.this.nr();
                            }
                        };
                        this.mUb = contentObserver;
                        this.f38346t.t(this.f38345n, uri, contentObserver);
                    }
                    if (this.gh == null) {
                        this.gh = new Runnable() { // from class: androidx.emoji2.text.I28
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f38348n.nr();
                            }
                        };
                    }
                    handlerT.postDelayed(this.gh, j2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private FontsContractCompat.FontInfo O() {
            try {
                FontsContractCompat.FontFamilyResult fontFamilyResultRl = this.f38346t.rl(this.f38345n, this.rl);
                if (fontFamilyResultRl.O() == 0) {
                    FontsContractCompat.FontInfo[] fontInfoArrT = fontFamilyResultRl.t();
                    if (fontInfoArrT == null || fontInfoArrT.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return fontInfoArrT[0];
                }
                throw new RuntimeException("fetchFonts failed (" + fontFamilyResultRl.O() + ")");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }

        private void rl() {
            synchronized (this.nr) {
                try {
                    this.xMQ = null;
                    ContentObserver contentObserver = this.mUb;
                    if (contentObserver != null) {
                        this.f38346t.nr(this.f38345n, contentObserver);
                        this.mUb = null;
                    }
                    Handler handler = this.f38344O;
                    if (handler != null) {
                        handler.removeCallbacks(this.gh);
                    }
                    this.f38344O = null;
                    ThreadPoolExecutor threadPoolExecutor = this.Uo;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.J2 = null;
                    this.Uo = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void Uo(Executor executor) {
            synchronized (this.nr) {
                this.J2 = executor;
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void n(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            Preconditions.KN(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.nr) {
                this.xMQ = metadataRepoLoaderCallback;
            }
            nr();
        }

        void nr() {
            synchronized (this.nr) {
                try {
                    if (this.xMQ == null) {
                        return;
                    }
                    if (this.J2 == null) {
                        ThreadPoolExecutor threadPoolExecutorRl = ConcurrencyHelpers.rl("emojiCompat");
                        this.Uo = threadPoolExecutorRl;
                        this.J2 = threadPoolExecutorRl;
                    }
                    this.J2.execute(new Runnable() { // from class: androidx.emoji2.text.Ml
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f38356n.t();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void t() {
            synchronized (this.nr) {
                try {
                    if (this.xMQ == null) {
                        return;
                    }
                    try {
                        FontsContractCompat.FontInfo fontInfoO = O();
                        int iRl = fontInfoO.rl();
                        if (iRl == 2) {
                            synchronized (this.nr) {
                                try {
                                    RetryPolicy retryPolicy = this.KN;
                                    if (retryPolicy != null) {
                                        long jN = retryPolicy.n();
                                        if (jN >= 0) {
                                            J2(fontInfoO.nr(), jN);
                                            return;
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (iRl != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iRl + ")");
                        }
                        try {
                            TraceCompat.n("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceN = this.f38346t.n(this.f38345n, fontInfoO);
                            ByteBuffer byteBufferJ2 = TypefaceCompatUtil.J2(this.f38345n, null, fontInfoO.nr());
                            if (byteBufferJ2 == null || typefaceN == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            MetadataRepo metadataRepoRl = MetadataRepo.rl(typefaceN, byteBufferJ2);
                            TraceCompat.rl();
                            synchronized (this.nr) {
                                try {
                                    EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback = this.xMQ;
                                    if (metadataRepoLoaderCallback != null) {
                                        metadataRepoLoaderCallback.rl(metadataRepoRl);
                                    }
                                } finally {
                                }
                            }
                            rl();
                        } catch (Throwable th) {
                            TraceCompat.rl();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.nr) {
                            try {
                                EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback2 = this.xMQ;
                                if (metadataRepoLoaderCallback2 != null) {
                                    metadataRepoLoaderCallback2.n(th2);
                                }
                                rl();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        FontRequestMetadataLoader(Context context, FontRequest fontRequest, FontProviderHelper fontProviderHelper) {
            Preconditions.KN(context, "Context cannot be null");
            Preconditions.KN(fontRequest, "FontRequest cannot be null");
            this.f38345n = context.getApplicationContext();
            this.rl = fontRequest;
            this.f38346t = fontProviderHelper;
        }
    }

    public static abstract class RetryPolicy {
        public abstract long n();
    }

    @RestrictTo
    public static class FontProviderHelper {
        public Typeface n(Context context, FontsContractCompat.FontInfo fontInfo) {
            return FontsContractCompat.n(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        public FontsContractCompat.FontFamilyResult rl(Context context, FontRequest fontRequest) {
            return FontsContractCompat.rl(context, null, fontRequest);
        }

        public void nr(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }

        public void t(Context context, Uri uri, ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest fontRequest) {
        super(new FontRequestMetadataLoader(context, fontRequest, gh));
    }

    public FontRequestEmojiCompatConfig t(Executor executor) {
        ((FontRequestMetadataLoader) n()).Uo(executor);
        return this;
    }
}
