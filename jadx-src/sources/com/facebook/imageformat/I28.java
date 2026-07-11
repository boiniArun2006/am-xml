package com.facebook.imageformat;

import Hh.Xo;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.facebook.imageformat.w6;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f52405n;
    private boolean nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.facebook.imageformat.j f52406t = new com.facebook.imageformat.j();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f52404O = new j(null);
    private static final Lazy J2 = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.facebook.imageformat.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I28.J2();
        }
    });

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int O(int i2, InputStream inputStream, byte[] bArr) throws IOException {
            if (bArr.length < i2) {
                throw new IllegalStateException(qUrazMnwDskFs.FryT);
            }
            if (!inputStream.markSupported()) {
                return Hh.j.rl(inputStream, bArr, 0, i2);
            }
            try {
                inputStream.mark(i2);
                return Hh.j.rl(inputStream, bArr, 0, i2);
            } finally {
                inputStream.reset();
            }
        }

        private j() {
        }

        public final w6 rl(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            return nr().t(is);
        }

        public final w6 t(InputStream is) {
            Intrinsics.checkNotNullParameter(is, "is");
            try {
                return rl(is);
            } catch (IOException e2) {
                throw Xo.n(e2);
            }
        }

        public final I28 nr() {
            return (I28) I28.J2.getValue();
        }
    }

    public static final I28 O() {
        return f52404O.nr();
    }

    public static final w6 nr(InputStream inputStream) {
        return f52404O.t(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 J2() {
        return new I28();
    }

    private final void KN() {
        this.f52405n = this.f52406t.rl();
        List list = this.rl;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f52405n = Math.max(this.f52405n, ((w6.n) it.next()).rl());
            }
        }
    }

    public final I28 Uo(boolean z2) {
        this.nr = z2;
        return this;
    }

    public final w6 t(InputStream is) throws IOException {
        Intrinsics.checkNotNullParameter(is, "is");
        int i2 = this.f52405n;
        byte[] bArr = new byte[i2];
        int iO = f52404O.O(i2, is, bArr);
        w6 w6VarN = this.f52406t.n(bArr, iO);
        if (Intrinsics.areEqual(w6VarN, n.ty) && !this.nr) {
            w6VarN = w6.nr;
        }
        if (w6VarN != w6.nr) {
            return w6VarN;
        }
        List list = this.rl;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w6 w6VarN2 = ((w6.n) it.next()).n(bArr, iO);
                if (w6VarN2 != w6.nr) {
                    return w6VarN2;
                }
            }
        }
        return w6.nr;
    }

    private I28() {
        KN();
    }
}
