package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u00019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001fJ{\u0010,\u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u00172\b\b\u0002\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", IV8ValueMap.FUNCTION_VALUES, "rl", "([F)[F", "Landroidx/compose/ui/geometry/Offset;", "point", "J2", "([FJ)J", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "", "Uo", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "qie", "([F[F)V", "", "az", "([F)Ljava/lang/String;", "KN", "([F)V", "", "degrees", "mUb", "([FF)V", "x", "y", "z", "gh", "([FFFF)V", "ty", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "xMQ", "([FFFFFFFFFFFF)V", "", "O", "([F)I", InneractiveMediationNameConsts.OTHER, "", "nr", "([FLjava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "[F", "getValues", "()[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
public final class Matrix {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float[] values;

    public static final long J2(float[] fArr, long j2) {
        if (fArr.length < 16) {
            return j2;
        }
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[7];
        float f9 = fArr[12];
        float f10 = fArr[13];
        float f11 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        float f12 = 1 / (((f5 * fIntBitsToFloat) + (f8 * fIntBitsToFloat2)) + f11);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        return Offset.O((((long) Float.floatToRawIntBits((((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9) * f12)) << 32) | (((long) Float.floatToRawIntBits(f12 * ((f4 * fIntBitsToFloat) + (f7 * fIntBitsToFloat2) + f10))) & 4294967295L));
    }

    public static final void KN(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static int O(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void gh(float[] fArr, float f3, float f4, float f5) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f3;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f3;
        fArr[3] = fArr[3] * f3;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    public static final /* synthetic */ Matrix n(float[] fArr) {
        return new Matrix(fArr);
    }

    public static boolean nr(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).getValues());
    }

    public static float[] rl(float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] t(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return rl(fArr);
    }

    public static final void ty(float[] fArr, float f3, float f4, float f5) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = (fArr[0] * f3) + (fArr[4] * f4) + (fArr[8] * f5) + fArr[12];
        float f7 = (fArr[1] * f3) + (fArr[5] * f4) + (fArr[9] * f5) + fArr[13];
        float f8 = (fArr[2] * f3) + (fArr[6] * f4) + (fArr[10] * f5) + fArr[14];
        float f9 = (fArr[3] * f3) + (fArr[7] * f4) + (fArr[11] * f5) + fArr[15];
        fArr[12] = f6;
        fArr[13] = f7;
        fArr[14] = f8;
        fArr[15] = f9;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final /* synthetic */ float[] getValues() {
        return this.values;
    }

    public boolean equals(Object obj) {
        return nr(this.values, obj);
    }

    public int hashCode() {
        return O(this.values);
    }

    public static /* synthetic */ void HI(float[] fArr, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = 0.0f;
        }
        ty(fArr, f3, f4, f5);
    }

    public static final void Uo(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[7];
        float f9 = fArr[12];
        float f10 = fArr[13];
        float f11 = fArr[15];
        float fRl = mutableRect.getLeft();
        float fNr = mutableRect.getTop();
        float fT = mutableRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String();
        float fN = mutableRect.getBottom();
        float f12 = f5 * fRl;
        float f13 = f8 * fNr;
        float f14 = 1.0f / ((f12 + f13) + f11);
        if ((Float.floatToRawIntBits(f14) & Integer.MAX_VALUE) >= 2139095040) {
            f14 = 0.0f;
        }
        float f15 = f3 * fRl;
        float f16 = f6 * fNr;
        float f17 = f14 * (f15 + f16 + f9);
        float f18 = fRl * f4;
        float f19 = fNr * f7;
        float f20 = f14 * (f18 + f19 + f10);
        float f21 = f8 * fN;
        float f22 = 1.0f / ((f12 + f21) + f11);
        if ((Float.floatToRawIntBits(f22) & Integer.MAX_VALUE) >= 2139095040) {
            f22 = 0.0f;
        }
        float f23 = f6 * fN;
        float f24 = (f15 + f23 + f9) * f22;
        float f25 = f7 * fN;
        float f26 = f22 * (f18 + f25 + f10);
        float f27 = f5 * fT;
        float f28 = 1.0f / ((f13 + f27) + f11);
        if ((Float.floatToRawIntBits(f28) & Integer.MAX_VALUE) >= 2139095040) {
            f28 = 0.0f;
        }
        float f29 = f3 * fT;
        float f30 = f28 * (f29 + f16 + f9);
        float f31 = fT * f4;
        float f32 = f28 * (f19 + f31 + f10);
        float f33 = 1.0f / ((f27 + f21) + f11);
        float f34 = (Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) < 2139095040 ? f33 : 0.0f;
        float f35 = (f29 + f23 + f9) * f34;
        float f36 = f34 * (f31 + f25 + f10);
        mutableRect.xMQ(Math.min(f17, Math.min(f24, Math.min(f30, f35))));
        mutableRect.gh(Math.min(f20, Math.min(f26, Math.min(f32, f36))));
        mutableRect.mUb(Math.max(f17, Math.max(f24, Math.max(f30, f35))));
        mutableRect.KN(Math.max(f20, Math.max(f26, Math.max(f32, f36))));
    }

    public static String az(float[] fArr) {
        return StringsKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void mUb(float[] fArr, float f3) {
        if (fArr.length < 16) {
            return;
        }
        double d2 = ((double) f3) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (fCos * f4) + (fSin * f5);
        float f7 = -fSin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (fCos * f8) + (fSin * f9);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (fCos * f11) + (fSin * f12);
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f13;
        fArr[3] = (fCos * f14) + (fSin * f15);
        fArr[4] = (f4 * f7) + (f5 * fCos);
        fArr[5] = (f8 * f7) + (f9 * fCos);
        fArr[6] = (f11 * f7) + (f12 * fCos);
        fArr[7] = (f7 * f14) + (fCos * f15);
    }

    public static final void qie(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f3 = fArr[0];
            float f4 = fArr2[0];
            float f5 = fArr[1];
            float f6 = fArr2[4];
            float f7 = fArr[2];
            float f8 = fArr2[8];
            float f9 = fArr[3];
            float f10 = fArr2[12];
            float f11 = (f3 * f4) + (f5 * f6) + (f7 * f8) + (f9 * f10);
            float f12 = fArr2[1];
            float f13 = fArr2[5];
            float f14 = fArr2[9];
            float f15 = fArr2[13];
            float f16 = (f3 * f12) + (f5 * f13) + (f7 * f14) + (f9 * f15);
            float f17 = fArr2[2];
            float f18 = fArr2[6];
            float f19 = fArr2[10];
            float f20 = fArr2[14];
            float f21 = (f3 * f17) + (f5 * f18) + (f7 * f19) + (f9 * f20);
            float f22 = fArr2[3];
            float f23 = fArr2[7];
            float f24 = fArr2[11];
            float f25 = fArr2[15];
            float f26 = (f3 * f22) + (f5 * f23) + (f7 * f24) + (f9 * f25);
            float f27 = fArr[4];
            float f28 = fArr[5];
            float f29 = fArr[6];
            float f30 = fArr[7];
            float f31 = (f27 * f4) + (f28 * f6) + (f29 * f8) + (f30 * f10);
            float f32 = (f27 * f12) + (f28 * f13) + (f29 * f14) + (f30 * f15);
            float f33 = (f27 * f17) + (f28 * f18) + (f29 * f19) + (f30 * f20);
            float f34 = (f27 * f22) + (f28 * f23) + (f29 * f24) + (f30 * f25);
            float f35 = fArr[8];
            float f36 = fArr[9];
            float f37 = fArr[10];
            float f38 = fArr[11];
            float f39 = (f35 * f4) + (f36 * f6) + (f37 * f8) + (f38 * f10);
            float f40 = (f35 * f12) + (f36 * f13) + (f37 * f14) + (f38 * f15);
            float f41 = (f35 * f17) + (f36 * f18) + (f37 * f19) + (f38 * f20);
            float f42 = (f35 * f22) + (f36 * f23) + (f37 * f24) + (f38 * f25);
            float f43 = fArr[12];
            float f44 = fArr[13];
            float f45 = (f4 * f43) + (f6 * f44);
            float f46 = fArr[14];
            float f47 = f45 + (f8 * f46);
            float f48 = fArr[15];
            fArr[0] = f11;
            fArr[1] = f16;
            fArr[2] = f21;
            fArr[3] = f26;
            fArr[4] = f31;
            fArr[5] = f32;
            fArr[6] = f33;
            fArr[7] = f34;
            fArr[8] = f39;
            fArr[9] = f40;
            fArr[10] = f41;
            fArr[11] = f42;
            fArr[12] = f47 + (f10 * f48);
            fArr[13] = (f12 * f43) + (f13 * f44) + (f14 * f46) + (f15 * f48);
            fArr[14] = (f17 * f43) + (f18 * f44) + (f19 * f46) + (f20 * f48);
            fArr[15] = (f43 * f22) + (f44 * f23) + (f46 * f24) + (f48 * f25);
        }
    }

    public static final void xMQ(float[] fArr, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        double d2 = ((double) f8) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d2);
        float fCos = (float) Math.cos(d2);
        float f14 = -fSin;
        float f15 = (f6 * fCos) - (f7 * fSin);
        float f16 = (f6 * fSin) + (f7 * fCos);
        double d4 = ((double) f9) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d4);
        float fCos2 = (float) Math.cos(d4);
        float f17 = -fSin2;
        float f18 = fSin * fSin2;
        float f19 = fSin * fCos2;
        float f20 = fCos * fSin2;
        float f21 = fCos * fCos2;
        float f22 = (f5 * fCos2) + (f16 * fSin2);
        float f23 = ((-f5) * fSin2) + (f16 * fCos2);
        double d5 = ((double) f10) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d5);
        float fCos3 = (float) Math.cos(d5);
        float f24 = -fSin3;
        float f25 = (f24 * fCos2) + (fCos3 * f18);
        float f26 = fCos * fCos3;
        float f27 = (f24 * f17) + (fCos3 * f19);
        float f28 = ((fCos2 * fCos3) + (f18 * fSin3)) * f11;
        float f29 = fSin3 * fCos * f11;
        float f30 = ((fCos3 * f17) + (fSin3 * f19)) * f11;
        float f31 = f25 * f12;
        float f32 = f26 * f12;
        float f33 = f27 * f12;
        float f34 = f20 * f13;
        float f35 = f14 * f13;
        float f36 = f21 * f13;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f28;
        fArr[1] = f29;
        fArr[2] = f30;
        fArr[3] = 0.0f;
        fArr[4] = f31;
        fArr[5] = f32;
        fArr[6] = f33;
        fArr[7] = 0.0f;
        fArr[8] = f34;
        fArr[9] = f35;
        fArr[10] = f36;
        fArr[11] = 0.0f;
        float f37 = -f3;
        fArr[12] = ((f28 * f37) - (f31 * f4)) + f22 + f3;
        fArr[13] = ((f29 * f37) - (f32 * f4)) + f15 + f4;
        fArr[14] = ((f37 * f30) - (f4 * f33)) + f23;
        fArr[15] = 1.0f;
    }

    public String toString() {
        return az(this.values);
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }
}
