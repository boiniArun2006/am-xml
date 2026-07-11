package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b'\u0010+R\u0016\u0010/\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0016\u00105\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104¨\u00066"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "", "initialCapacity", "<init>", "(I)V", "t", "()Landroidx/collection/LongSparseArray;", "", "key", "O", "(J)Ljava/lang/Object;", "defaultValue", "J2", "(JLjava/lang/Object;)Ljava/lang/Object;", "", "qie", "(J)V", "index", "az", "value", "gh", "(JLjava/lang/Object;)V", "ty", "()I", "", "xMQ", "()Z", "mUb", "(I)J", "HI", "(I)Ljava/lang/Object;", "KN", "(J)I", "nr", "(J)Z", "rl", "()V", c.f62177j, "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", IV8ValueMap.FUNCTION_KEYS, "", "", "[Ljava/lang/Object;", IV8ValueMap.FUNCTION_VALUES, "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,243:1\n218#2:244\n229#2,5:245\n223#2,11:250\n239#2,8:261\n239#2,8:269\n250#2,9:277\n263#2,5:286\n271#2,7:291\n286#2,9:298\n320#2,12:307\n299#2,18:319\n334#2,21:337\n358#2,2:358\n360#2:361\n364#2,5:362\n373#2,2:367\n299#2,18:369\n376#2:387\n380#2:388\n384#2:389\n385#2:393\n388#2,2:395\n299#2,18:397\n391#2:415\n396#2:416\n397#2:420\n400#2,2:422\n299#2,18:424\n404#2:442\n409#2:443\n410#2:447\n413#2,2:449\n299#2,18:451\n416#2,2:469\n421#2,2:471\n299#2,18:473\n424#2:491\n429#2,2:492\n299#2,18:494\n432#2,6:512\n442#2:518\n447#2:519\n452#2,8:520\n463#2,6:528\n299#2,18:534\n470#2,10:552\n483#2,21:562\n1#3:360\n59#4,3:390\n63#4:394\n59#4,3:417\n63#4:421\n59#4,3:444\n63#4:448\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n92#1:244\n92#1:245,5\n99#1:250,11\n103#1:261,8\n106#1:269,8\n115#1:277,9\n118#1:286,5\n127#1:291,7\n138#1:298,9\n144#1:307,12\n144#1:319,18\n144#1:337,21\n150#1:358,2\n150#1:361\n161#1:362,5\n164#1:367,2\n164#1:369,18\n164#1:387\n171#1:388\n183#1:389\n183#1:393\n183#1:395,2\n183#1:397,18\n183#1:415\n195#1:416\n195#1:420\n195#1:422,2\n195#1:424,18\n195#1:442\n203#1:443\n203#1:447\n203#1:449,2\n203#1:451,18\n203#1:469,2\n209#1:471,2\n209#1:473,18\n209#1:491\n218#1:492,2\n218#1:494,18\n218#1:512,6\n221#1:518\n224#1:519\n227#1:520,8\n233#1:528,6\n233#1:534,18\n233#1:552,10\n241#1:562,21\n150#1:360\n183#1:390,3\n183#1:394\n195#1:417,3\n195#1:421\n203#1:444,3\n203#1:448\n*E\n"})
public class LongSparseArray<E> implements Cloneable {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public /* synthetic */ int size;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ long[] keys;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public Object HI(int index) {
        if (!(index >= 0 && index < this.size)) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f14765n) {
                    if (i5 != i3) {
                        jArr[i3] = jArr[i5];
                        objArr[i3] = obj;
                        objArr[i5] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.values[index];
    }

    public long mUb(int index) {
        if (!(index >= 0 && index < this.size)) {
            RuntimeHelpersKt.n("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f14765n) {
                    if (i5 != i3) {
                        jArr[i3] = jArr[i5];
                        objArr[i3] = obj;
                        objArr[i5] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.keys[index];
    }

    public LongSparseArray(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.rl;
            this.values = ContainerHelpersKt.f14932t;
        } else {
            int iJ2 = ContainerHelpersKt.J2(i2);
            this.keys = new long[iJ2];
            this.values = new Object[iJ2];
        }
    }

    public Object J2(long key, Object defaultValue) {
        int iRl = ContainerHelpersKt.rl(this.keys, this.size, key);
        return (iRl < 0 || this.values[iRl] == LongSparseArrayKt.f14765n) ? defaultValue : this.values[iRl];
    }

    public int KN(long key) {
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f14765n) {
                    if (i5 != i3) {
                        jArr[i3] = jArr[i5];
                        objArr[i3] = obj;
                        objArr[i5] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return ContainerHelpersKt.rl(this.keys, this.size, key);
    }

    public Object O(long key) {
        int iRl = ContainerHelpersKt.rl(this.keys, this.size, key);
        if (iRl < 0 || this.values[iRl] == LongSparseArrayKt.f14765n) {
            return null;
        }
        return this.values[iRl];
    }

    public void az(int index) {
        if (this.values[index] != LongSparseArrayKt.f14765n) {
            this.values[index] = LongSparseArrayKt.f14765n;
            this.garbage = true;
        }
    }

    public void gh(long key, Object value) {
        int iRl = ContainerHelpersKt.rl(this.keys, this.size, key);
        if (iRl >= 0) {
            this.values[iRl] = value;
            return;
        }
        int i2 = ~iRl;
        if (i2 < this.size && this.values[i2] == LongSparseArrayKt.f14765n) {
            this.keys[i2] = key;
            this.values[i2] = value;
            return;
        }
        if (this.garbage) {
            int i3 = this.size;
            long[] jArr = this.keys;
            if (i3 >= jArr.length) {
                Object[] objArr = this.values;
                int i5 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    Object obj = objArr[i7];
                    if (obj != LongSparseArrayKt.f14765n) {
                        if (i7 != i5) {
                            jArr[i5] = jArr[i7];
                            objArr[i5] = obj;
                            objArr[i7] = null;
                        }
                        i5++;
                    }
                }
                this.garbage = false;
                this.size = i5;
                i2 = ~ContainerHelpersKt.rl(this.keys, i5, key);
            }
        }
        int i8 = this.size;
        if (i8 >= this.keys.length) {
            int iJ2 = ContainerHelpersKt.J2(i8 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iJ2);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iJ2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i9 = this.size;
        if (i9 - i2 != 0) {
            long[] jArr2 = this.keys;
            int i10 = i2 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i10, i2, i9);
            Object[] objArr2 = this.values;
            ArraysKt.copyInto(objArr2, objArr2, i10, i2, this.size);
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size++;
    }

    public void n(long key, Object value) {
        int i2 = this.size;
        if (i2 != 0 && key <= this.keys[i2 - 1]) {
            gh(key, value);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                Object[] objArr = this.values;
                int i3 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    Object obj = objArr[i5];
                    if (obj != LongSparseArrayKt.f14765n) {
                        if (i5 != i3) {
                            jArr[i3] = jArr[i5];
                            objArr[i3] = obj;
                            objArr[i5] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
            }
        }
        int i7 = this.size;
        if (i7 >= this.keys.length) {
            int iJ2 = ContainerHelpersKt.J2(i7 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iJ2);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iJ2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i7] = key;
        this.values[i7] = value;
        this.size = i7 + 1;
    }

    public void qie(long key) {
        int iRl = ContainerHelpersKt.rl(this.keys, this.size, key);
        if (iRl < 0 || this.values[iRl] == LongSparseArrayKt.f14765n) {
            return;
        }
        this.values[iRl] = LongSparseArrayKt.f14765n;
        this.garbage = true;
    }

    public void rl() {
        int i2 = this.size;
        Object[] objArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public int ty() {
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                Object obj = objArr[i5];
                if (obj != LongSparseArrayKt.f14765n) {
                    if (i5 != i3) {
                        jArr[i3] = jArr[i5];
                        objArr[i3] = obj;
                        objArr[i5] = null;
                    }
                    i3++;
                }
            }
            this.garbage = false;
            this.size = i3;
        }
        return this.size;
    }

    public boolean nr(long key) {
        if (KN(key) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public LongSparseArray clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray longSparseArray = (LongSparseArray) objClone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public String toString() {
        if (ty() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(mUb(i3));
            sb.append('=');
            Object objHI = HI(i3);
            if (objHI != sb) {
                sb.append(objHI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean xMQ() {
        if (ty() == 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ LongSparseArray(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
