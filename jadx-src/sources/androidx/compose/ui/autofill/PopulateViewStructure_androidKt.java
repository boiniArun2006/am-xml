package androidx.compose.ui.autofill;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsInfoKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/ViewStructure;", "Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "", "packageName", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/ViewStructure;Landroidx/compose/ui/semantics/SemanticsInfo;Landroid/view/autofill/AutofillId;Ljava/lang/String;Landroidx/compose/ui/spatial/RectManager;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPopulateViewStructure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,192:1\n357#2,4:193\n329#2,6:197\n339#2,3:204\n342#2,9:208\n361#2:217\n357#2,4:218\n329#2,6:222\n339#2,3:229\n342#2,9:233\n361#2:242\n1399#3:203\n1270#3:207\n1399#3:228\n1270#3:232\n1#4:243\n34#5,6:244\n*S KotlinDebug\n*F\n+ 1 PopulateViewStructure.android.kt\nandroidx/compose/ui/autofill/PopulateViewStructure_androidKt\n*L\n70#1:193,4\n70#1:197,6\n70#1:204,3\n70#1:208,9\n70#1:217\n93#1:218,4\n93#1:222,6\n93#1:229,3\n93#1:233,9\n93#1:242\n70#1:203\n70#1:207\n93#1:228\n93#1:232\n160#1:244,6\n*E\n"})
public final class PopulateViewStructure_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0187: PHI (r21v6 androidx.compose.ui.autofill.ContentDataType) = (r21v5 androidx.compose.ui.autofill.ContentDataType), (r21v7 androidx.compose.ui.autofill.ContentDataType) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r23v10 androidx.compose.ui.state.ToggleableState) = (r23v9 androidx.compose.ui.state.ToggleableState), (r23v11 androidx.compose.ui.state.ToggleableState) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r24v6 androidx.compose.ui.autofill.ContentType) = (r24v5 androidx.compose.ui.autofill.ContentType), (r24v7 androidx.compose.ui.autofill.ContentType) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r26v6 androidx.compose.ui.semantics.Role) = (r26v5 androidx.compose.ui.semantics.Role), (r26v7 androidx.compose.ui.semantics.Role) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r29v6 androidx.compose.ui.text.AnnotatedString) = (r29v5 androidx.compose.ui.text.AnnotatedString), (r29v7 androidx.compose.ui.text.AnnotatedString) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final ViewStructure viewStructure, SemanticsInfo semanticsInfo, AutofillId autofillId, String str, RectManager rectManager) {
        int i2;
        long j2;
        char c2;
        long j3;
        ToggleableState toggleableState;
        ContentDataType contentDataType;
        boolean z2;
        ContentType contentType;
        Boolean bool;
        Role role;
        boolean z3;
        Integer num;
        AnnotatedString annotatedString;
        List list;
        String strXMQ;
        String[] strArrRl;
        String[] strArrRl2;
        MutableScatterMap props;
        SemanticsProperties semanticsProperties;
        SemanticsProperties semanticsProperties2;
        MutableScatterMap props2;
        ToggleableState toggleableState2;
        int i3;
        final AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f31121n;
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f33276n;
        SemanticsActions semanticsActions = SemanticsActions.f33251n;
        SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
        int i5 = 8;
        if (semanticsConfigurationD == null || (props2 = semanticsConfigurationD.getProps()) == null) {
            i2 = 2;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            toggleableState = null;
            contentDataType = null;
            z2 = false;
            contentType = null;
            bool = null;
            role = null;
            z3 = false;
            num = null;
            annotatedString = null;
        } else {
            Object[] objArr = props2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            j2 = 255;
            Object[] objArr2 = props2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = props2.metadata;
            int length = jArr.length - 2;
            i2 = 2;
            if (length >= 0) {
                int i7 = 0;
                c2 = 7;
                contentDataType = null;
                z2 = false;
                toggleableState2 = null;
                contentType = null;
                bool = null;
                role = null;
                z3 = false;
                num = null;
                annotatedString = null;
                j3 = -9187201950435737472L;
                while (true) {
                    long j4 = jArr[i7];
                    Object[] objArr3 = objArr2;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j4 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj = objArr[i10];
                                Object obj2 = objArr3[i10];
                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                i3 = i5;
                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.t())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    contentDataType = (ContentDataType) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.nr())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    String str2 = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (str2 != null) {
                                        autofillApi26Helper.ck(viewStructure, str2);
                                    }
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.O())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    contentType = (ContentType) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.Uo())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    annotatedString = (AnnotatedString) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.xMQ())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    autofillApi26Helper.XQ(viewStructure, ((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.ViF())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.g())) {
                                    z3 = true;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.iF())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    role = (Role) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.E2())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties3.s7N())) {
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    toggleableState2 = (ToggleableState) obj2;
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.qie())) {
                                    autofillApi26Helper.HI(viewStructure, true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.ty())) {
                                    autofillApi26Helper.aYN(viewStructure, true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.Z())) {
                                    autofillApi26Helper.Z(viewStructure, true);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.nY())) {
                                    z2 = true;
                                }
                            } else {
                                i3 = i5;
                            }
                            j4 >>= i3;
                            i9++;
                            i5 = i3;
                        }
                        if (i8 != i5) {
                            break;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        objArr2 = objArr3;
                        i5 = 8;
                    }
                }
            } else {
                c2 = 7;
                j3 = -9187201950435737472L;
                contentDataType = null;
                z2 = false;
                toggleableState2 = null;
                contentType = null;
                bool = null;
                role = null;
                z3 = false;
                num = null;
                annotatedString = null;
            }
            toggleableState = toggleableState2;
        }
        SemanticsConfiguration semanticsConfigurationN = SemanticsInfoKt.n(semanticsInfo);
        if (semanticsConfigurationN == null || (props = semanticsConfigurationN.getProps()) == null) {
            list = null;
        } else {
            Object[] objArr4 = props.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            Object[] objArr5 = props.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr2 = props.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i11];
                    if ((((~j5) << c2) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr4[i14];
                                Object obj4 = objArr5[i14];
                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) obj3;
                                semanticsProperties2 = semanticsProperties3;
                                if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties2.J2())) {
                                    autofillApi26Helper.o(viewStructure, false);
                                } else if (Intrinsics.areEqual(semanticsPropertyKey2, semanticsProperties2.T())) {
                                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                semanticsProperties2 = semanticsProperties3;
                            }
                            j5 >>= 8;
                            i13++;
                            semanticsProperties3 = semanticsProperties2;
                        }
                        semanticsProperties = semanticsProperties3;
                        if (i12 != 8) {
                            break;
                        }
                    } else {
                        semanticsProperties = semanticsProperties3;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i11++;
                    semanticsProperties3 = semanticsProperties;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(semanticsInfo.getSemanticsId());
        if (semanticsInfo.n() == null) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        autofillApi26Helper.xMQ(viewStructure, autofillId, iIntValue);
        autofillApi26Helper.S(viewStructure, iIntValue, str, null, null);
        Integer numValueOf2 = contentDataType != null ? Integer.valueOf(ContentDataType_androidKt.rl(contentDataType)) : z2 ? 1 : toggleableState != null ? Integer.valueOf(i2) : null;
        if (numValueOf2 != null) {
            autofillApi26Helper.mUb(viewStructure, numValueOf2.intValue());
        }
        if (contentType != null && (strArrRl2 = ContentType_androidKt.rl(contentType)) != null) {
            autofillApi26Helper.KN(viewStructure, strArrRl2);
        }
        rectManager.getRects().qie(semanticsInfo.getSemanticsId(), new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num2, Integer num3, Integer num4, Integer num5) {
                n(num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i15, int i16, int i17, int i18) {
                autofillApi26Helper.r(viewStructure, i15, i16, 0, 0, i17 - i15, i18 - i16);
            }
        });
        if (bool != null) {
            autofillApi26Helper.ViF(viewStructure, bool.booleanValue());
        }
        if (toggleableState != null) {
            autofillApi26Helper.qie(viewStructure, true);
            autofillApi26Helper.az(viewStructure, toggleableState == ToggleableState.f33331n);
        } else if (bool != null) {
            if (!(role == null ? false : Role.az(role.getValue(), Role.INSTANCE.KN()))) {
                autofillApi26Helper.qie(viewStructure, true);
                autofillApi26Helper.az(viewStructure, bool.booleanValue());
            }
        }
        boolean z4 = z3 || (contentType != null && (strArrRl = ContentType_androidKt.rl(contentType)) != null && ArraysKt.contains(strArrRl, (String) ArraysKt.first(ContentType_androidKt.rl(ContentType.INSTANCE.n()))));
        if (z4) {
            autofillApi26Helper.Ik(viewStructure, true);
        }
        autofillApi26Helper.g(viewStructure, semanticsInfo.I() ? 4 : 0);
        if (list != null) {
            int size = list.size();
            String str3 = "";
            for (int i15 = 0; i15 < size; i15++) {
                str3 = str3 + ((AnnotatedString) list.get(i15)).getText() + '\n';
            }
            autofillApi26Helper.nY(viewStructure, str3);
            autofillApi26Helper.ty(viewStructure, "android.widget.TextView");
        }
        if (semanticsInfo.a().isEmpty() && role != null && (strXMQ = SemanticsUtils_androidKt.xMQ(role.getValue())) != null) {
            autofillApi26Helper.ty(viewStructure, strXMQ);
        }
        if (z2) {
            autofillApi26Helper.ty(viewStructure, "android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                AutofillApi28Helper.f31123n.n(viewStructure, num.intValue());
            }
            if (annotatedString != null) {
                autofillApi26Helper.gh(viewStructure, autofillApi26Helper.rl(annotatedString.getText()));
            }
            if (z4) {
                autofillApi26Helper.WPU(viewStructure, 129);
            }
        }
    }
}
