package androidx.compose.ui.text.font;

import GJW.C;
import GJW.vd;
import androidx.collection.MutableScatterSet;
import com.safedk.android.analytics.brandsafety.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {b.f61769v}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n482#2,4:445\n34#2,4:449\n486#2,3:453\n39#2:456\n489#2:457\n150#2,3:458\n34#2,6:461\n153#2:467\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n106#1:445,4\n106#1:449,4\n106#1:453,3\n106#1:456\n106#1:457\n107#1:458,3\n107#1:461,6\n107#1:467\n*E\n"})
final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ FontListFontFamilyTypefaceAdapter J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ List f33676O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f33677n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ PlatformFontLoader f33678r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f33679t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3(List list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, Continuation continuation) {
        super(2, continuation);
        this.f33676O = list;
        this.J2 = fontListFontFamilyTypefaceAdapter;
        this.f33678r = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.f33676O, this.J2, this.f33678r, continuation);
        fontListFontFamilyTypefaceAdapter$preload$3.f33679t = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f33677n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f33679t;
            List list = this.f33676O;
            MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj2 = list.get(i3);
                if (mutableScatterSet.xMQ((Font) obj2)) {
                    arrayList.add(obj2);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.J2;
            PlatformFontLoader platformFontLoader = this.f33678r;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList2.add(C.rl(vdVar, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i5), platformFontLoader, null), 3, null));
            }
            this.f33677n = 1;
            if (GJW.Wre.t(arrayList2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
