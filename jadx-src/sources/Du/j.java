package Du;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j implements XA.Ml {
    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected abstract int J2(Object obj);

    protected abstract void KN(gi.w6 w6Var, Object obj, int i2, int i3);

    protected abstract Iterator O(Object obj);

    protected abstract Object az(Object obj);

    protected abstract void nr(Object obj, int i2);

    protected abstract Object qie(Object obj);

    protected abstract Object rl();

    protected abstract int t(Object obj);

    protected abstract void xMQ(gi.w6 w6Var, int i2, Object obj, boolean z2);

    private j() {
    }

    public static /* synthetic */ void mUb(j jVar, gi.w6 w6Var, int i2, Object obj, boolean z2, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        jVar.xMQ(w6Var, i2, obj, z2);
    }

    public final Object Uo(gi.I28 decoder, Object obj) {
        Object objRl;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (obj == null || (objRl = qie(obj)) == null) {
            objRl = rl();
        }
        Object obj2 = objRl;
        int iT = t(obj2);
        gi.w6 w6VarRl = decoder.rl(getDescriptor());
        if (!w6VarRl.HI()) {
            while (true) {
                int iNY = w6VarRl.nY(getDescriptor());
                if (iNY == -1) {
                    break;
                }
                mUb(this, w6VarRl, iT + iNY, obj2, false, 8, null);
            }
        } else {
            KN(w6VarRl, obj2, iT, gh(w6VarRl, obj2));
        }
        w6VarRl.t(getDescriptor());
        return az(obj2);
    }

    public Object deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Uo(decoder, null);
    }

    private final int gh(gi.w6 w6Var, Object obj) {
        int iX = w6Var.X(getDescriptor());
        nr(obj, iX);
        return iX;
    }
}
