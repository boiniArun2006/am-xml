package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@AnyThread
public class EmojiCompat {
    private static volatile EmojiCompat Ik;
    final MetadataRepoLoader J2;
    final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CompatInternal f38312O;
    private final SpanFactory Uo;
    private final int az;
    private final boolean gh;
    final int[] mUb;
    private final int qie;
    private final Set rl;
    private final GlyphChecker ty;
    final boolean xMQ;
    private static final Object HI = new Object();
    private static final Object ck = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ReadWriteLock f38313n = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile int f38314t = 3;
    private final Handler nr = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CodepointSequenceMatchResult {
    }

    private static class CompatInternal {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final EmojiCompat f38315n;

        void O(EditorInfo editorInfo) {
        }

        int n(CharSequence charSequence, int i2) {
            return -1;
        }

        CharSequence nr(CharSequence charSequence, int i2, int i3, int i5, boolean z2) {
            return charSequence;
        }

        int rl(CharSequence charSequence, int i2) {
            return -1;
        }

        void t() {
            this.f38315n.Ik();
        }

        CompatInternal(EmojiCompat emojiCompat) {
            this.f38315n = emojiCompat;
        }
    }

    @RequiresApi
    private static final class CompatInternal19 extends CompatInternal {
        private volatile EmojiProcessor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private volatile MetadataRepo f38316t;

        void J2(MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.f38315n.ck(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f38316t = metadataRepo;
            MetadataRepo metadataRepo2 = this.f38316t;
            SpanFactory spanFactory = this.f38315n.Uo;
            GlyphChecker glyphChecker = this.f38315n.ty;
            EmojiCompat emojiCompat = this.f38315n;
            this.rl = new EmojiProcessor(metadataRepo2, spanFactory, glyphChecker, emojiCompat.xMQ, emojiCompat.mUb, EmojiExclusions.n());
            this.f38315n.Ik();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void O(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f38316t.O());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f38315n.KN);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int n(CharSequence charSequence, int i2) {
            return this.rl.rl(charSequence, i2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        CharSequence nr(CharSequence charSequence, int i2, int i3, int i5, boolean z2) {
            return this.rl.mUb(charSequence, i2, i3, i5, z2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int rl(CharSequence charSequence, int i2) {
            return this.rl.t(charSequence, i2);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void t() {
            try {
                this.f38315n.J2.n(new MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void n(Throwable th) {
                        CompatInternal19.this.f38315n.ck(th);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void rl(MetadataRepo metadataRepo) {
                        CompatInternal19.this.J2(metadataRepo);
                    }
                });
            } catch (Throwable th) {
                this.f38315n.ck(th);
            }
        }

        CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }
    }

    public static abstract class Config {
        Set J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int[] f38318O;
        boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MetadataRepoLoader f38319n;
        boolean nr;
        SpanFactory rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f38320t;
        int KN = -16711936;
        int xMQ = 0;
        GlyphChecker mUb = new DefaultGlyphChecker();

        protected final MetadataRepoLoader n() {
            return this.f38319n;
        }

        public Config rl(int i2) {
            this.xMQ = i2;
            return this;
        }

        protected Config(MetadataRepoLoader metadataRepoLoader) {
            Preconditions.KN(metadataRepoLoader, "metadataLoader cannot be null.");
            this.f38319n = metadataRepoLoader;
        }
    }

    @RestrictTo
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public EmojiSpan n(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    public interface GlyphChecker {
        boolean n(CharSequence charSequence, int i2, int i3, int i5);
    }

    public static abstract class InitCallback {
        public void n(Throwable th) {
        }

        public void rl() {
        }
    }

    private static class ListenerDispatcher implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f38321O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f38322n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f38323t;

        ListenerDispatcher(InitCallback initCallback, int i2) {
            this(Arrays.asList((InitCallback) Preconditions.KN(initCallback, "initCallback cannot be null")), i2, null);
        }

        ListenerDispatcher(Collection collection, int i2) {
            this(collection, i2, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f38322n.size();
            int i2 = 0;
            if (this.f38321O != 1) {
                while (i2 < size) {
                    ((InitCallback) this.f38322n.get(i2)).n(this.f38323t);
                    i2++;
                }
            } else {
                while (i2 < size) {
                    ((InitCallback) this.f38322n.get(i2)).rl();
                    i2++;
                }
            }
        }

        ListenerDispatcher(Collection collection, int i2, Throwable th) {
            Preconditions.KN(collection, "initCallbacks cannot be null");
            this.f38322n = new ArrayList(collection);
            this.f38321O = i2;
            this.f38323t = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void n(MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void n(Throwable th);

        public abstract void rl(MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        EmojiSpan n(TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public CharSequence Z(CharSequence charSequence, int i2, int i3, int i5) {
        return XQ(charSequence, i2, i3, i5, 0);
    }

    public CharSequence r(CharSequence charSequence) {
        return o(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    private void HI() {
        this.f38313n.writeLock().lock();
        try {
            if (this.az == 0) {
                this.f38314t = 0;
            }
            this.f38313n.writeLock().unlock();
            if (Uo() == 0) {
                this.f38312O.t();
            }
        } catch (Throwable th) {
            this.f38313n.writeLock().unlock();
            throw th;
        }
    }

    public static boolean gh() {
        return Ik != null;
    }

    public static EmojiCompat mUb(Config config) {
        EmojiCompat emojiCompat;
        EmojiCompat emojiCompat2 = Ik;
        if (emojiCompat2 != null) {
            return emojiCompat2;
        }
        synchronized (HI) {
            try {
                emojiCompat = Ik;
                if (emojiCompat == null) {
                    emojiCompat = new EmojiCompat(config);
                    Ik = emojiCompat;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    public static EmojiCompat t() {
        EmojiCompat emojiCompat;
        synchronized (HI) {
            emojiCompat = Ik;
            Preconditions.xMQ(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    void Ik() {
        ArrayList arrayList = new ArrayList();
        this.f38313n.writeLock().lock();
        try {
            this.f38314t = 1;
            arrayList.addAll(this.rl);
            this.rl.clear();
            this.f38313n.writeLock().unlock();
            this.nr.post(new ListenerDispatcher(arrayList, this.f38314t));
        } catch (Throwable th) {
            this.f38313n.writeLock().unlock();
            throw th;
        }
    }

    public int O() {
        return this.qie;
    }

    public void S(InitCallback initCallback) {
        Preconditions.KN(initCallback, "initCallback cannot be null");
        this.f38313n.writeLock().lock();
        try {
            if (this.f38314t == 1 || this.f38314t == 2) {
                this.nr.post(new ListenerDispatcher(initCallback, this.f38314t));
            } else {
                this.rl.add(initCallback);
            }
            this.f38313n.writeLock().unlock();
        } catch (Throwable th) {
            this.f38313n.writeLock().unlock();
            throw th;
        }
    }

    public int Uo() {
        this.f38313n.readLock().lock();
        try {
            return this.f38314t;
        } finally {
            this.f38313n.readLock().unlock();
        }
    }

    public void WPU(InitCallback initCallback) {
        Preconditions.KN(initCallback, "initCallback cannot be null");
        this.f38313n.writeLock().lock();
        try {
            this.rl.remove(initCallback);
        } finally {
            this.f38313n.writeLock().unlock();
        }
    }

    void ck(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f38313n.writeLock().lock();
        try {
            this.f38314t = 2;
            arrayList.addAll(this.rl);
            this.rl.clear();
            this.f38313n.writeLock().unlock();
            this.nr.post(new ListenerDispatcher(arrayList, this.f38314t, th));
        } catch (Throwable th2) {
            this.f38313n.writeLock().unlock();
            throw th2;
        }
    }

    public boolean qie() {
        return this.gh;
    }

    public void ty() {
        Preconditions.xMQ(this.az == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (az()) {
            return;
        }
        this.f38313n.writeLock().lock();
        try {
            if (this.f38314t == 0) {
                return;
            }
            this.f38314t = 0;
            this.f38313n.writeLock().unlock();
            this.f38312O.t();
        } finally {
            this.f38313n.writeLock().unlock();
        }
    }

    private EmojiCompat(Config config) {
        this.KN = config.f38320t;
        this.xMQ = config.nr;
        this.mUb = config.f38318O;
        this.gh = config.Uo;
        this.qie = config.KN;
        this.J2 = config.f38319n;
        this.az = config.xMQ;
        this.ty = config.mUb;
        ArraySet arraySet = new ArraySet();
        this.rl = arraySet;
        SpanFactory spanFactory = config.rl;
        this.Uo = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        Set set = config.J2;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(config.J2);
        }
        this.f38312O = new CompatInternal19(this);
        HI();
    }

    public static boolean KN(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        return EmojiProcessor.nr(inputConnection, editable, i2, i3, z2);
    }

    private boolean az() {
        if (Uo() == 1) {
            return true;
        }
        return false;
    }

    public static boolean xMQ(Editable editable, int i2, KeyEvent keyEvent) {
        return EmojiProcessor.O(editable, i2, keyEvent);
    }

    public int J2(CharSequence charSequence, int i2) {
        Preconditions.xMQ(az(), "Not initialized yet");
        Preconditions.KN(charSequence, "charSequence cannot be null");
        return this.f38312O.rl(charSequence, i2);
    }

    public CharSequence XQ(CharSequence charSequence, int i2, int i3, int i5, int i7) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Preconditions.xMQ(az(), "Not initialized yet");
        Preconditions.O(i2, "start cannot be negative");
        Preconditions.O(i3, "end cannot be negative");
        Preconditions.O(i5, "maxEmojiCount cannot be negative");
        boolean z6 = false;
        if (i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.rl(z2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.rl(z3, "start should be < than charSequence length");
        if (i3 <= charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.rl(z4, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                z6 = this.KN;
            }
            z5 = z6;
        } else {
            z5 = true;
        }
        return this.f38312O.nr(charSequence, i2, i3, i5, z5);
    }

    public void aYN(EditorInfo editorInfo) {
        if (az() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f38312O.O(editorInfo);
        }
    }

    public int nr(CharSequence charSequence, int i2) {
        Preconditions.xMQ(az(), "Not initialized yet");
        Preconditions.KN(charSequence, "charSequence cannot be null");
        return this.f38312O.n(charSequence, i2);
    }

    public CharSequence o(CharSequence charSequence, int i2, int i3) {
        return Z(charSequence, i2, i3, Integer.MAX_VALUE);
    }
}
