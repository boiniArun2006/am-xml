package androidx.compose.runtime.internal;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", "size", "", IV8ValueMap.FUNCTION_KEYS, "", IV8ValueMap.FUNCTION_VALUES, "<init>", "(I[J[Ljava/lang/Object;)V", "", "key", c.f62177j, "(J)I", "rl", "(J)Ljava/lang/Object;", "value", "", "nr", "(JLjava/lang/Object;)Z", "t", "(JLjava/lang/Object;)Landroidx/compose/runtime/internal/ThreadMap;", "I", "[J", "[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12634#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
public final class ThreadMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long[] keys;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object[] values;

    private final int n(long key) {
        int i2 = this.size - 1;
        if (i2 != -1) {
            int i3 = 0;
            if (i2 != 0) {
                while (i3 <= i2) {
                    int i5 = (i3 + i2) >>> 1;
                    long j2 = this.keys[i5] - key;
                    if (j2 < 0) {
                        i3 = i5 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i5;
                        }
                        i2 = i5 - 1;
                    }
                }
                return -(i3 + 1);
            }
            long j3 = this.keys[0];
            if (j3 == key) {
                return 0;
            }
            if (j3 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final ThreadMap t(long key, Object value) {
        int i2 = this.size;
        int i3 = 0;
        int i5 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i5++;
            }
        }
        int i7 = i5 + 1;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        if (i7 > 1) {
            int i8 = 0;
            while (true) {
                if (i3 >= i7 || i8 >= i2) {
                    break;
                }
                long j2 = this.keys[i8];
                Object obj2 = this.values[i8];
                if (j2 > key) {
                    jArr[i3] = key;
                    objArr[i3] = value;
                    i3++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i3] = j2;
                    objArr[i3] = obj2;
                    i3++;
                }
                i8++;
            }
            if (i8 == i2) {
                jArr[i5] = key;
                objArr[i5] = value;
            } else {
                while (i3 < i7) {
                    long j3 = this.keys[i8];
                    Object obj3 = this.values[i8];
                    if (obj3 != null) {
                        jArr[i3] = j3;
                        objArr[i3] = obj3;
                        i3++;
                    }
                    i8++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new ThreadMap(i7, jArr, objArr);
    }

    public ThreadMap(int i2, long[] jArr, Object[] objArr) {
        this.size = i2;
        this.keys = jArr;
        this.values = objArr;
    }

    public final boolean nr(long key, Object value) {
        int iN = n(key);
        if (iN < 0) {
            return false;
        }
        this.values[iN] = value;
        return true;
    }

    public final Object rl(long key) {
        int iN = n(key);
        if (iN >= 0) {
            return this.values[iN];
        }
        return null;
    }
}
