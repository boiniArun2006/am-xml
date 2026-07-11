package com.bendingspoons.concierge.ui.secretmenu;

import Dk.C;
import Dk.InterfaceC1335n;
import GJW.aC;
import GJW.vd;
import YgZ.w6;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.bendingspoons.concierge.domain.entities.Id;
import com.bendingspoons.concierge.ui.secretmenu.IDsActivity;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bendingspoons/concierge/ui/secretmenu/IDsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/bendingspoons/concierge/domain/entities/Id;", "conciergeId", "", "fcU", "(Lcom/bendingspoons/concierge/domain/entities/Id;)V", "", "conciergeIds", "Mx", "(Ljava/util/List;)V", "mYa", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", c.f62177j, "Ljava/util/List;", "ids", "t", "j", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIDsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IDsActivity.kt\ncom/bendingspoons/concierge/ui/secretmenu/IDsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,110:1\n1557#2:111\n1628#2,3:112\n37#3:115\n36#3,3:116\n*S KotlinDebug\n*F\n+ 1 IDsActivity.kt\ncom/bendingspoons/concierge/ui/secretmenu/IDsActivity\n*L\n58#1:111\n58#1:112,3\n62#1:115\n62#1:116,3\n*E\n"})
public final class IDsActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static InterfaceC1335n f51222O;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List ids;

    /* JADX INFO: renamed from: com.bendingspoons.concierge.ui.secretmenu.IDsActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InterfaceC1335n n() {
            InterfaceC1335n interfaceC1335n = IDsActivity.f51222O;
            if (interfaceC1335n != null) {
                return interfaceC1335n;
            }
            Intrinsics.throwUninitializedPropertyAccessException("concierge");
            return null;
        }

        public final boolean rl() {
            return IDsActivity.f51222O != null;
        }

        public final void t(InterfaceC1335n interfaceC1335n) {
            Intrinsics.checkNotNullParameter(interfaceC1335n, "<set-?>");
            IDsActivity.f51222O = interfaceC1335n;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f51225O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f51226n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f51227t;

        public static final class j implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                String name = ((Id) obj).getName();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String name2 = ((Id) obj2).getName();
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                String lowerCase2 = name2.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return ComparisonsKt.compareValues(lowerCase, lowerCase2);
            }
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            List list2;
            x0X.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51225O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        list = (List) this.f51227t;
                        list2 = (List) this.f51226n;
                        ResultKt.throwOnFailure(obj);
                        nVar = (x0X.n) obj;
                        if (!(nVar instanceof n.C1266n)) {
                            if (nVar instanceof n.w6) {
                                list.add(new Id.CustomId("backend_id", ((Id.Predefined.Internal) ((n.w6) nVar).n()).getValue()));
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return CollectionsKt.sortedWith(list2, new j());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC1335n interfaceC1335nN = IDsActivity.INSTANCE.n();
                this.f51225O = 1;
                obj = interfaceC1335nN.n(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            List mutableList = CollectionsKt.toMutableList((Collection) obj);
            InterfaceC1335n interfaceC1335nN2 = IDsActivity.INSTANCE.n();
            Id.Predefined.Internal.j jVar = Id.Predefined.Internal.j.J2;
            this.f51226n = mutableList;
            this.f51227t = mutableList;
            this.f51225O = 2;
            Object objO = interfaceC1335nN2.O(jVar, this);
            if (objO != coroutine_suspended) {
                list = mutableList;
                obj = objO;
                list2 = list;
                nVar = (x0X.n) obj;
                if (!(nVar instanceof n.C1266n)) {
                }
                return CollectionsKt.sortedWith(list2, new j());
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence G7(Id it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName() + ": " + it.getValue();
    }

    private final void Mx(List conciergeIds) {
        String strJoinToString$default = CollectionsKt.joinToString$default(conciergeIds, null, null, null, 0, null, new Function1() { // from class: Tb.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IDsActivity.G7((Id) obj);
            }
        }, 31, null);
        w6 w6Var = w6.f12217n;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        w6.O(w6Var, applicationContext, null, strJoinToString$default, 2, null);
        Toast.makeText(getApplicationContext(), "All IDs copied to clipboard.", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Org(Id it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName() + ": " + it.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eWT(IDsActivity iDsActivity, DialogInterface dialogInterface, int i2) {
        List list = iDsActivity.ids;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ids");
            list = null;
        }
        iDsActivity.Mx(list);
        dialogInterface.dismiss();
    }

    private final void mYa(List conciergeIds) {
        String strJoinToString$default = CollectionsKt.joinToString$default(conciergeIds, null, null, null, 0, null, new Function1() { // from class: Tb.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IDsActivity.Org((Id) obj);
            }
        }, 31, null);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", strJoinToString$default);
        intent.setType("text/plain");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qm(IDsActivity iDsActivity, DialogInterface dialogInterface, int i2) {
        List list = iDsActivity.ids;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ids");
            list = null;
        }
        iDsActivity.fcU((Id) list.get(i2));
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ul(IDsActivity iDsActivity, DialogInterface dialogInterface, int i2) {
        List list = iDsActivity.ids;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ids");
            list = null;
        }
        iDsActivity.mYa(list);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jk(IDsActivity iDsActivity, DialogInterface dialogInterface) {
        iDsActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rl(IDsActivity iDsActivity, DialogInterface dialogInterface) {
        iDsActivity.finish();
    }

    private final void fcU(Id conciergeId) {
        String str = conciergeId.getName() + ": " + conciergeId.getValue();
        w6 w6Var = w6.f12217n;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        w6.O(w6Var, applicationContext, null, str, 2, null);
        Toast.makeText(getApplicationContext(), "ID copied to clipboard.", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n1(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C.f1913n);
        if (!INSTANCE.rl()) {
            finish();
            return;
        }
        List<Id> list = null;
        this.ids = (List) aC.rl(null, new n(null), 1, null);
        nv.n nVarTy = new nv.n(this).setTitle("IDs").ck("Copy all IDs", new DialogInterface.OnClickListener() { // from class: Tb.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IDsActivity.eWT(this.f10520n, dialogInterface, i2);
            }
        }).s7N("Share all IDs", new DialogInterface.OnClickListener() { // from class: Tb.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IDsActivity.ul(this.f10521n, dialogInterface, i2);
            }
        }).mUb("Cancel", new DialogInterface.OnClickListener() { // from class: Tb.w6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IDsActivity.n1(dialogInterface, i2);
            }
        }).az(new DialogInterface.OnCancelListener() { // from class: Tb.Ml
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                IDsActivity.Jk(this.f10518n, dialogInterface);
            }
        }).ty(new DialogInterface.OnDismissListener() { // from class: Tb.I28
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                IDsActivity.Rl(this.f10517n, dialogInterface);
            }
        });
        List list2 = this.ids;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ids");
        } else {
            list = list2;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Id id : list) {
            String name = id.getName();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = name.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase + ":\n" + StringsKt.take(id.getValue(), 10) + "...");
        }
        nVarTy.fD((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: Tb.Wre
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IDsActivity.qm(this.f10519n, dialogInterface, i2);
            }
        }).rl(false).XQ();
    }
}
