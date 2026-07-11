package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.caoccao.javet.values.reference.V8ValueError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J;\u0010&\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00042$\u0010%\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u0003J\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u0003R\u0016\u0010+\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b(\u0010*R\u0016\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0011\u00100\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010/¨\u00061"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "", "actualSize", "currentSize", "", "currentItems", "", "xMQ", "(II[J)V", "", "stackMeta", "deltaX", "deltaY", "gh", "(JII)V", "value", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "parentId", "", "focusable", "gesturable", "nr", "(IIIIIIZZ)V", "KN", "(I)Z", "mUb", "(IIIII)Z", "Uo", "J2", "(I)V", "Lkotlin/Function4;", "block", "qie", "(ILkotlin/jvm/functions/Function4;)Z", "rl", c.f62177j, "[J", "items", V8ValueError.STACK, "I", "itemsSize", "()I", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,968:1\n102#1,8:969\n787#2:977\n787#2:978\n803#2:979\n870#2:980\n804#2:981\n870#2:982\n805#2:983\n870#2:984\n806#2,3:985\n810#2:988\n828#2,2:989\n810#2:991\n810#2:992\n787#2:993\n787#2:994\n823#2:995\n810#2:996\n787#2:997\n787#2:998\n823#2:999\n837#2:1000\n839#2:1001\n818#2:1002\n803#2:1003\n870#2:1004\n804#2:1005\n870#2:1006\n805#2:1007\n870#2:1008\n806#2,3:1009\n810#2:1012\n812#2:1013\n815#2:1014\n812#2:1015\n837#2,3:1016\n787#2:1019\n837#2,3:1020\n787#2:1023\n823#2:1024\n815#2:1025\n818#2:1026\n810#2:1027\n823#2:1028\n810#2:1029\n837#2:1030\n839#2:1031\n837#2:1032\n839#2:1033\n810#2:1034\n810#2:1035\n810#2:1036\n787#2:1037\n787#2:1038\n860#2,2:1039\n810#2:1041\n810#2:1042\n837#2:1043\n839#2:1044\n837#2:1045\n839#2:1046\n787#2:1047\n860#2,2:1048\n810#2:1050\n860#2,2:1051\n837#2:1053\n839#2:1054\n837#2:1055\n839#2:1056\n810#2:1057\n837#2:1058\n839#2:1059\n837#2:1060\n839#2:1061\n810#2:1062\n837#2:1063\n839#2:1064\n837#2:1065\n839#2:1066\n837#2:1067\n839#2:1068\n837#2:1069\n839#2:1070\n810#2:1071\n825#2:1072\n835#2:1073\n810#2:1074\n810#2:1075\n812#2:1076\n837#2:1077\n839#2:1078\n837#2:1079\n839#2:1080\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:969,8\n151#1:977\n152#1:978\n154#1:979\n154#1:980\n154#1:981\n154#1:982\n154#1:983\n154#1:984\n154#1:985,3\n176#1:988\n183#1:989,2\n205#1:991\n234#1:992\n235#1:993\n236#1:994\n237#1:995\n260#1:996\n262#1:997\n263#1:998\n264#1:999\n265#1:1000\n266#1:1001\n268#1:1002\n281#1:1003\n281#1:1004\n281#1:1005\n281#1:1006\n281#1:1007\n281#1:1008\n281#1:1009,3\n320#1:1012\n321#1:1013\n322#1:1014\n328#1:1015\n331#1:1016,3\n331#1:1019\n333#1:1020,3\n333#1:1023\n334#1:1024\n335#1:1025\n339#1:1026\n355#1:1027\n356#1:1028\n372#1:1029\n376#1:1030\n377#1:1031\n378#1:1032\n379#1:1033\n396#1:1034\n418#1:1035\n435#1:1036\n454#1:1037\n455#1:1038\n463#1:1039,2\n467#1:1041\n485#1:1042\n486#1:1043\n487#1:1044\n488#1:1045\n489#1:1046\n505#1:1047\n513#1:1048,2\n515#1:1050\n544#1:1051,2\n546#1:1053\n547#1:1054\n548#1:1055\n549#1:1056\n550#1:1057\n582#1:1058\n583#1:1059\n584#1:1060\n585#1:1061\n634#1:1062\n635#1:1063\n636#1:1064\n637#1:1065\n638#1:1066\n669#1:1067\n670#1:1068\n671#1:1069\n672#1:1070\n682#1:1071\n719#1:1072\n731#1:1073\n735#1:1074\n753#1:1075\n754#1:1076\n755#1:1077\n756#1:1078\n757#1:1079\n758#1:1080\n*E\n"})
public final class RectList {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public long[] items = new long[192];

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public long[] stack = new long[192];

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int itemsSize;

    public static /* synthetic */ void O(RectList rectList, int i2, int i3, int i5, int i7, int i8, int i9, boolean z2, boolean z3, int i10, Object obj) {
        boolean z4;
        RectList rectList2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = (i10 & 32) != 0 ? -1 : i9;
        boolean z5 = (i10 & 64) != 0 ? false : z2;
        if ((i10 & 128) != 0) {
            z4 = false;
            i11 = i2;
            i12 = i3;
            i13 = i5;
            i14 = i7;
            i15 = i8;
            rectList2 = rectList;
        } else {
            z4 = z3;
            rectList2 = rectList;
            i11 = i2;
            i12 = i3;
            i13 = i5;
            i14 = i7;
            i15 = i8;
        }
        rectList2.nr(i11, i12, i13, i14, i15, i16, z5, z4);
    }

    private final void gh(long stackMeta, int deltaX, int deltaY) {
        int i2;
        char c2;
        char c4;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int iT = t();
        jArr2[0] = stackMeta;
        int i3 = 1;
        while (i3 > 0) {
            i3--;
            long j2 = jArr2[i3];
            int i5 = 67108863;
            int i7 = ((int) j2) & 67108863;
            char c5 = 26;
            int i8 = ((int) (j2 >> 26)) & 67108863;
            char c6 = '4';
            char c7 = 511;
            int i9 = ((int) (j2 >> 52)) & 511;
            int i10 = i9 == 511 ? iT : i9 + i8;
            if (i8 < 0) {
                return;
            }
            while (i8 < jArr.length - 2 && i8 < i10) {
                int i11 = i8 + 2;
                long j3 = jArr[i11];
                int i12 = i5;
                char c8 = c5;
                if ((((int) (j3 >> c8)) & i12) == i7) {
                    long j4 = jArr[i8];
                    int i13 = i8 + 1;
                    c2 = c6;
                    long j5 = jArr[i13];
                    i2 = i7;
                    jArr[i8] = (((long) (((int) j4) + deltaY)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + deltaX)) << 32);
                    jArr[i13] = (((long) (((int) j5) + deltaY)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + deltaX)) << 32);
                    jArr[i11] = 2305843009213693952L | j3;
                    c4 = 511;
                    if ((((int) (j3 >> c2)) & 511) > 0) {
                        jArr2[i3] = (((long) ((i8 + 3) & i12)) << c8) | ((-4503599560261633L) & j3);
                        i3++;
                    }
                } else {
                    i2 = i7;
                    c2 = c6;
                    c4 = c7;
                }
                i8 += 3;
                i5 = i12;
                c5 = c8;
                c7 = c4;
                c6 = c2;
                i7 = i2;
            }
        }
    }

    private final void xMQ(int actualSize, int currentSize, long[] currentItems) {
        int iMax = Math.max(actualSize * 2, currentSize + 3);
        long[] jArrCopyOf = Arrays.copyOf(currentItems, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    public final boolean Uo(int value, int l2, int t3, int r2, int b2) {
        int i2 = value & 67108863;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
            int i7 = i5 + 2;
            long j2 = jArr[i7];
            if ((((int) j2) & 67108863) == i2) {
                long j3 = jArr[i5];
                jArr[i5] = (((long) t3) & 4294967295L) | (((long) l2) << 32);
                int i8 = i5;
                jArr[i5 + 1] = (((long) b2) & 4294967295L) | (((long) r2) << 32);
                jArr[i7] = 2305843009213693952L | j2;
                int i9 = l2 - ((int) (j3 >> 32));
                int i10 = t3 - ((int) j3);
                if ((i9 != 0) | (i10 != 0)) {
                    gh(((-4503599560261633L) & j2) | (((long) ((i8 + 3) & 67108863)) << 26), i9, i10);
                }
                return true;
            }
        }
        return false;
    }

    public final void n() {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            jArr[i5] = jArr[i5] & (-2305843009213693953L);
        }
    }

    public final void nr(int value, int l2, int t3, int r2, int b2, int parentId, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        int i3 = i2 + 3;
        this.itemsSize = i3;
        int length = jArr.length;
        if (length <= i3) {
            xMQ(length, i2, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i2] = (((long) l2) << 32) | (((long) t3) & 4294967295L);
        jArr2[i2 + 1] = (((long) r2) << 32) | (((long) b2) & 4294967295L);
        int i5 = parentId & 67108863;
        jArr2[i2 + 2] = ((gesturable ? 1L : 0L) << 63) | ((focusable ? 1L : 0L) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i5) << 26) | ((long) (value & 67108863));
        if (parentId < 0) {
            return;
        }
        for (int i7 = i2 - 3; i7 >= 0; i7 -= 3) {
            int i8 = i7 + 2;
            long j2 = jArr2[i8];
            if ((((int) j2) & 67108863) == i5) {
                jArr2[i8] = (j2 & (-2301339409586323457L)) | (((long) ((i2 - i7) & 511)) << 52);
                return;
            }
        }
    }

    public final void rl() {
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        long[] jArr2 = this.stack;
        int i3 = 0;
        for (int i5 = 0; i5 < jArr.length - 2 && i3 < jArr2.length - 2 && i5 < i2; i5 += 3) {
            int i7 = i5 + 2;
            if (jArr[i7] != 2305843009213693951L) {
                jArr2[i3] = jArr[i5];
                jArr2[i3 + 1] = jArr[i5 + 1];
                jArr2[i3 + 2] = jArr[i7];
                i3 += 3;
            }
        }
        this.itemsSize = i3;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final int t() {
        return this.itemsSize / 3;
    }

    public final void J2(int value) {
        int i2 = value & 67108863;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
            int i7 = i5 + 2;
            long j2 = jArr[i7];
            if ((((int) j2) & 67108863) == i2) {
                jArr[i7] = 2305843009213693952L | j2;
                return;
            }
        }
    }

    public final boolean KN(int value) {
        int i2 = value & 67108863;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
            int i7 = i5 + 2;
            if ((((int) jArr[i7]) & 67108863) == i2) {
                jArr[i5] = -1;
                jArr[i5 + 1] = -1;
                jArr[i7] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean mUb(int value, int l2, int t3, int r2, int b2) {
        int i2 = value & 67108863;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
            int i7 = i5 + 2;
            long j2 = jArr[i7];
            if ((((int) j2) & 67108863) == i2) {
                jArr[i5] = (((long) l2) << 32) | (((long) t3) & 4294967295L);
                jArr[i5 + 1] = (((long) r2) << 32) | (((long) b2) & 4294967295L);
                jArr[i7] = 2305843009213693952L | j2;
                return true;
            }
        }
        return false;
    }

    public final boolean qie(int value, Function4 block) {
        int i2 = value & 67108863;
        long[] jArr = this.items;
        int i3 = this.itemsSize;
        for (int i5 = 0; i5 < jArr.length - 2 && i5 < i3; i5 += 3) {
            if ((((int) jArr[i5 + 2]) & 67108863) == i2) {
                long j2 = jArr[i5];
                long j3 = jArr[i5 + 1];
                block.invoke(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
                return true;
            }
        }
        return false;
    }
}
