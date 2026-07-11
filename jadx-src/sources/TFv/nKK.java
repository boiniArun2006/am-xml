package TFv;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class nKK {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final dzu.nKK f10461n = new dzu.nKK("NO_VALUE");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J2(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final Wre O(Z z2, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return ((i2 == 0 || i2 == -3) && jVar == ILs.j.f4185n) ? z2 : new teV.CN3(z2, coroutineContext, i2, jVar);
    }

    public static final r n(int i2, int i3, ILs.j jVar) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i2).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i3).toString());
        }
        if (i2 > 0 || i3 > 0 || jVar == ILs.j.f4185n) {
            int i5 = i3 + i2;
            if (i5 < 0) {
                i5 = Integer.MAX_VALUE;
            }
            return new Ew(i2, i5, jVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + jVar).toString());
    }

    public static /* synthetic */ r rl(int i2, int i3, ILs.j jVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            jVar = ILs.j.f4185n;
        }
        return n(i2, i3, jVar);
    }
}
