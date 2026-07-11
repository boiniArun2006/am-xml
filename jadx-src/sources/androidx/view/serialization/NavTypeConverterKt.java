package androidx.view.serialization;

import EJn.Pl;
import EJn.Wre;
import XA.Ml;
import XA.r;
import androidx.view.NavType;
import androidx.view.serialization.InternalNavType;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEJn/Wre;", "Landroidx/navigation/NavType;", "rl", "(LEJn/Wre;)Landroidx/navigation/NavType;", "Landroidx/navigation/serialization/InternalType;", "nr", "(LEJn/Wre;)Landroidx/navigation/serialization/InternalType;", "Ljava/lang/Class;", c.f62177j, "(LEJn/Wre;)Ljava/lang/Class;", "Lkotlin/reflect/KType;", "kType", "", "t", "(LEJn/Wre;Lkotlin/reflect/KType;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NavTypeConverterKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Class n(Wre wre) {
        String strReplace$default = StringsKt.replace$default(wre.KN(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(strReplace$default);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (StringsKt.contains$default((CharSequence) strReplace$default, (CharSequence) ".", false, 2, (Object) null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(strReplace$default, "\\$"));
                Intrinsics.checkNotNullExpressionValue(cls2, "forName(className)");
                return cls2;
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + wre.KN() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    public static final NavType rl(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        InternalType internalTypeNr = nr(wre);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[internalTypeNr.ordinal()]) {
            case 1:
                return NavType.nr;
            case 2:
                return NavType.ty;
            case 3:
                return NavType.gh;
            case 4:
                return NavType.KN;
            case 5:
                return InternalNavType.f40450n.KN();
            case 6:
                return NavType.Ik;
            case 7:
                NavType navTypeNr = NavType.INSTANCE.nr(n(wre), false);
                return navTypeNr == null ? UNKNOWN.f40488Z : navTypeNr;
            case 8:
                return InternalNavType.f40450n.J2();
            case 9:
                return InternalNavType.f40450n.n();
            case 10:
                return InternalNavType.f40450n.nr();
            case 11:
                return InternalNavType.f40450n.t();
            case 12:
                return InternalNavType.f40450n.O();
            case 13:
                return InternalNavType.f40450n.Uo();
            case 14:
                return NavType.J2;
            case 15:
                return NavType.HI;
            case 16:
                return InternalNavType.f40450n.rl();
            case 17:
                return NavType.qie;
            case 18:
                return NavType.xMQ;
            case 19:
                return nr(wre.Uo(0)) == InternalType.STRING ? NavType.f40156r : UNKNOWN.f40488Z;
            case 20:
                switch (iArr[nr(wre.Uo(0)).ordinal()]) {
                    case 1:
                        return NavType.Uo;
                    case 2:
                        return NavType.ck;
                    case 3:
                        return NavType.az;
                    case 4:
                        return NavType.mUb;
                    case 5:
                        return NavType.f40155o;
                    case 6:
                        return InternalNavType.f40450n.xMQ();
                    case 7:
                        Class clsN = n(wre.Uo(0));
                        Intrinsics.checkNotNull(clsN, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new InternalNavType.EnumListType(clsN);
                    default:
                        return UNKNOWN.f40488Z;
                }
            case 21:
                Class clsN2 = n(wre);
                if (!Enum.class.isAssignableFrom(clsN2)) {
                    return UNKNOWN.f40488Z;
                }
                Intrinsics.checkNotNull(clsN2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                return new InternalNavType.EnumNullableType(clsN2);
            default:
                return UNKNOWN.f40488Z;
        }
    }

    public static final boolean t(Wre wre, KType kType) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(kType, "kType");
        if (wre.rl() != kType.isMarkedNullable()) {
            return false;
        }
        Ml mlJ2 = r.J2(kType);
        if (mlJ2 != null) {
            return Intrinsics.areEqual(wre, mlJ2.getDescriptor());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
    }

    private static final InternalType nr(Wre wre) {
        String strReplace$default = StringsKt.replace$default(wre.KN(), "?", "", false, 4, (Object) null);
        if (Intrinsics.areEqual(wre.getKind(), Pl.n.f2281n)) {
            if (wre.rl()) {
                return InternalType.ENUM_NULLABLE;
            }
            return InternalType.ENUM;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Int")) {
            if (wre.rl()) {
                return InternalType.INT_NULLABLE;
            }
            return InternalType.INT;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Boolean")) {
            if (wre.rl()) {
                return InternalType.BOOL_NULLABLE;
            }
            return InternalType.BOOL;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Double")) {
            if (wre.rl()) {
                return InternalType.DOUBLE_NULLABLE;
            }
            return InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Double")) {
            return InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Float")) {
            if (wre.rl()) {
                return InternalType.FLOAT_NULLABLE;
            }
            return InternalType.FLOAT;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Long")) {
            if (wre.rl()) {
                return InternalType.LONG_NULLABLE;
            }
            return InternalType.LONG;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.String")) {
            if (wre.rl()) {
                return InternalType.STRING_NULLABLE;
            }
            return InternalType.STRING;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.IntArray")) {
            return InternalType.INT_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.DoubleArray")) {
            return InternalType.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.BooleanArray")) {
            return InternalType.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.FloatArray")) {
            return InternalType.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.LongArray")) {
            return InternalType.LONG_ARRAY;
        }
        if (Intrinsics.areEqual(strReplace$default, "kotlin.Array")) {
            return InternalType.ARRAY;
        }
        if (StringsKt.startsWith$default(strReplace$default, "kotlin.collections.ArrayList", false, 2, (Object) null)) {
            return InternalType.LIST;
        }
        return InternalType.UNKNOWN;
    }
}
