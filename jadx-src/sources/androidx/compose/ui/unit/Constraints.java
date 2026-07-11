package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u001fR\u001a\u0010(\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u001fR\u001a\u0010+\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "value", "rl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "t", "(JIIII)J", "", "Ik", "(J)Ljava/lang/String;", "HI", "(J)I", InneractiveMediationNameConsts.OTHER, "", "O", "(JLjava/lang/Object;)Z", c.f62177j, "J", "getValue$annotations", "()V", "ty", "qie", "az", "gh", "KN", "(J)Z", "hasBoundedWidth", "Uo", "hasBoundedHeight", "mUb", "getHasFixedWidth$annotations", "hasFixedWidth", "xMQ", "getHasFixedHeight$annotations", "hasFixedHeight", "ck", "isZero$annotations", "isZero", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n37#4,5:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,5\n*E\n"})
public final class Constraints {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long value;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "t", "(II)J", "O", "(I)J", "nr", "minWidth", "maxWidth", "minHeight", "maxHeight", "rl", "(IIII)J", c.f62177j, V8ValueDouble.INFINITY, "I", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n37#2,5:635\n37#2,5:640\n37#2,5:645\n465#3,6:650\n465#3,6:656\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,5\n231#1:640,5\n243#1:645,5\n305#1:650,6\n341#1:656,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long O(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.n("width must be >= 0");
            }
            return ConstraintsKt.KN(width, width, 0, Integer.MAX_VALUE);
        }

        public final long nr(int height) {
            if (!(height >= 0)) {
                InlineClassHelperKt.n("height must be >= 0");
            }
            return ConstraintsKt.KN(0, Integer.MAX_VALUE, height, height);
        }

        public final long t(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                InlineClassHelperKt.n("width and height must be >= 0");
            }
            return ConstraintsKt.KN(width, width, height, height);
        }

        private Companion() {
        }

        public final long n(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin;
            int i2;
            int i3 = 262142;
            int iMin2 = Math.min(minHeight, 262142);
            int iMin3 = Integer.MAX_VALUE;
            if (maxHeight == Integer.MAX_VALUE) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = Math.min(maxHeight, 262142);
            }
            if (iMin == Integer.MAX_VALUE) {
                i2 = iMin2;
            } else {
                i2 = iMin;
            }
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i3 = 65534;
                } else if (i2 < 65535) {
                    i3 = 32766;
                } else if (i2 < 262143) {
                    i3 = 8190;
                } else {
                    ConstraintsKt.qie(i2);
                    throw new KotlinNothingValueException();
                }
            }
            if (maxWidth != Integer.MAX_VALUE) {
                iMin3 = Math.min(i3, maxWidth);
            }
            return ConstraintsKt.n(Math.min(i3, minWidth), iMin3, iMin2, iMin);
        }

        public final long rl(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin;
            int i2;
            int i3 = 262142;
            int iMin2 = Math.min(minWidth, 262142);
            int iMin3 = Integer.MAX_VALUE;
            if (maxWidth == Integer.MAX_VALUE) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = Math.min(maxWidth, 262142);
            }
            if (iMin == Integer.MAX_VALUE) {
                i2 = iMin2;
            } else {
                i2 = iMin;
            }
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i3 = 65534;
                } else if (i2 < 65535) {
                    i3 = 32766;
                } else if (i2 < 262143) {
                    i3 = 8190;
                } else {
                    ConstraintsKt.qie(i2);
                    throw new KotlinNothingValueException();
                }
            }
            if (maxHeight != Integer.MAX_VALUE) {
                iMin3 = Math.min(i3, maxHeight);
            }
            return ConstraintsKt.n(iMin2, iMin, Math.min(i3, minHeight), iMin3);
        }
    }

    public static int HI(long j2) {
        return Long.hashCode(j2);
    }

    public static final boolean J2(long j2, long j3) {
        return j2 == j3;
    }

    public static final boolean KN(long j2) {
        int i2 = (int) (3 & j2);
        return (((int) (j2 >> 33)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static boolean O(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).getValue();
    }

    public static final boolean Uo(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        return (((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) != 0;
    }

    public static final int az(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        return ((int) (j2 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    public static final boolean ck(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        return ((((int) (j2 >> 33)) & ((1 << (i3 + 13)) - 1)) - 1 == 0) | ((((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1)) - 1 == 0);
    }

    public static final int gh(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        int i5 = ((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    public static final boolean mUb(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1;
        int i5 = ((int) (j2 >> 2)) & i3;
        int i7 = ((int) (j2 >> 33)) & i3;
        return i5 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static final /* synthetic */ Constraints n(long j2) {
        return new Constraints(j2);
    }

    public static final int qie(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((int) (j2 >> 33)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static long rl(long j2) {
        return j2;
    }

    public static final int ty(long j2) {
        int i2 = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static final boolean xMQ(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3);
        int i5 = (1 << (18 - i3)) - 1;
        int i7 = ((int) (j2 >> (i3 + 15))) & i5;
        int i8 = ((int) (j2 >> (i3 + 46))) & i5;
        return i7 == (i8 == 0 ? Integer.MAX_VALUE : i8 - 1);
    }

    public boolean equals(Object obj) {
        return O(this.value, obj);
    }

    public int hashCode() {
        return HI(this.value);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public static /* synthetic */ long nr(long j2, int i2, int i3, int i5, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i2 = ty(j2);
        }
        int i9 = i2;
        if ((i8 & 2) != 0) {
            i3 = qie(j2);
        }
        int i10 = i3;
        if ((i8 & 4) != 0) {
            i5 = az(j2);
        }
        int i11 = i5;
        if ((i8 & 8) != 0) {
            i7 = gh(j2);
        }
        return t(j2, i9, i10, i11, i7);
    }

    public static final long t(long j2, int i2, int i3, int i5, int i7) {
        if (!(i3 >= i2 && i7 >= i5 && i2 >= 0 && i5 >= 0)) {
            InlineClassHelperKt.n("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.KN(i2, i3, i5, i7);
    }

    public String toString() {
        return Ik(this.value);
    }

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    public static String Ik(long j2) {
        String strValueOf;
        int iQie = qie(j2);
        String strValueOf2 = V8ValueDouble.INFINITY;
        if (iQie == Integer.MAX_VALUE) {
            strValueOf = V8ValueDouble.INFINITY;
        } else {
            strValueOf = String.valueOf(iQie);
        }
        int iGh = gh(j2);
        if (iGh != Integer.MAX_VALUE) {
            strValueOf2 = String.valueOf(iGh);
        }
        return "Constraints(minWidth = " + ty(j2) + ", maxWidth = " + strValueOf + ", minHeight = " + az(j2) + ", maxHeight = " + strValueOf2 + ')';
    }
}
