package mF;

import android.graphics.Bitmap;
import android.view.Surface;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w9.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface w6 extends aC {

    public interface Ml extends w6 {
        Object qie(j jVar, Continuation continuation);
    }

    public static abstract class j {

        /* JADX INFO: renamed from: mF.w6$j$j, reason: collision with other inner class name */
        public static final class C1053j extends j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Bitmap f70682n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1053j) && Intrinsics.areEqual(this.f70682n, ((C1053j) obj).f70682n);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1053j(Bitmap bitmap) {
                super(null);
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                this.f70682n = bitmap;
            }

            public int hashCode() {
                return this.f70682n.hashCode();
            }

            public String toString() {
                return "BitmapContent(bitmap=" + this.f70682n + ')';
            }
        }

        public static final class n extends j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Oe.w6 f70683n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && Intrinsics.areEqual(this.f70683n, ((n) obj).f70683n);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(Oe.w6 size) {
                super(null);
                Intrinsics.checkNotNullParameter(size, "size");
                this.f70683n = size;
            }

            public int hashCode() {
                return this.f70683n.hashCode();
            }

            public final Oe.w6 n() {
                return this.f70683n;
            }

            public String toString() {
                return "EmptyContent(size=" + this.f70683n + ')';
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public interface n {
        Object n(Continuation continuation);

        Object rl(j jVar, Continuation continuation);

        Oe.w6 t();
    }

    /* JADX INFO: renamed from: mF.w6$w6, reason: collision with other inner class name */
    public interface InterfaceC1054w6 extends w6 {
        Object O(long j2, Oe.w6 w6Var, Continuation continuation);

        Surface ty();
    }

    long XQ();

    Object getValue();
}
