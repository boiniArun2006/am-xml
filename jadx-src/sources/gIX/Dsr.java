package gIX;

import QmE.iF;
import QmE.j;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.widget.RecyclerViewEx;
import com.google.firebase.auth.FirebaseAuth;
import e.C1960j;
import gIX.Dsr;
import gIX.rv6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yc.xq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ boolean E2;
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f67203O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ List f67204S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ List f67205Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f67206e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ SceneThumbnailMaker f67207g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67208n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ kgE.fuX f67209o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ iF f67210r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f67211t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ComponentActivity componentActivity, String str, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, boolean z2, boolean z3, Continuation continuation) {
            super(2, continuation);
            this.f67211t = componentActivity;
            this.f67203O = str;
            this.J2 = list;
            this.f67210r = iFVar;
            this.f67209o = fux;
            this.f67205Z = list2;
            this.f67204S = list3;
            this.f67207g = sceneThumbnailMaker;
            this.E2 = z2;
            this.f67206e = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void gh(ComponentActivity componentActivity, String str, String str2, View view) {
            new AlertDialog.Builder(componentActivity).setTitle(str).KN(str2).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: gIX.fuX
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Dsr.j.qie(dialogInterface, i2);
                }
            }).create().show();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f67211t, this.f67203O, this.J2, this.f67210r, this.f67209o, this.f67205Z, this.f67204S, this.f67207g, this.E2, this.f67206e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMUb;
            boolean z2;
            final ComponentActivity componentActivity;
            iF iFVar;
            String str;
            List list;
            String str2;
            Bitmap bitmapN;
            Bitmap bitmap;
            Bitmap bitmap2;
            final String string;
            String string2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67208n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ComponentActivity componentActivity2 = this.f67211t;
                String str3 = this.f67203O;
                List list2 = this.J2;
                iF iFVar2 = this.f67210r;
                kgE.fuX fux = this.f67209o;
                List list3 = this.f67205Z;
                List list4 = this.f67204S;
                SceneThumbnailMaker sceneThumbnailMaker = this.f67207g;
                this.f67208n = 1;
                objMUb = QJ.mUb(componentActivity2, str3, list2, iFVar2, fux, list3, list4, sceneThumbnailMaker, this);
                if (objMUb == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMUb = obj;
            }
            List list5 = this.J2;
            ComponentActivity componentActivity3 = this.f67211t;
            boolean z3 = this.E2;
            boolean z4 = this.f67206e;
            iF iFVar3 = this.f67210r;
            List list6 = this.f67204S;
            C c2 = (C) objMUb;
            if (c2 == null) {
                return Unit.INSTANCE;
            }
            String title = ((ProjectInfo.n) CollectionsKt.first(list5)).getTitle();
            String quantityString = list5.size() > 1 ? componentActivity3.getResources().getQuantityString(2131886108, list5.size() - 1, Boxing.boxInt(list5.size() - 1)) : null;
            Bitmap bitmapCk = nKK.ck(c2.t(), null, 2, null);
            String strT = c2.t();
            aC aCVarN = c2.n();
            Bitmap bitmapMUb = nKK.mUb(componentActivity3, strT, aCVarN != null ? aCVarN.n() : null);
            Bitmap bitmapQie = nKK.qie(componentActivity3, title, quantityString, rv6.w6.C0944w6.KN, bitmapCk, null, 32, null);
            Bitmap bitmapQie2 = nKK.qie(componentActivity3, title, quantityString, rv6.w6.n.KN, bitmapCk, null, 32, null);
            rv6.w6.Ml ml = rv6.w6.Ml.KN;
            aC aCVarN2 = c2.n();
            if (aCVarN2 != null) {
                z2 = z4;
                componentActivity = componentActivity3;
                iFVar = iFVar3;
                str = title;
                String str4 = quantityString;
                list = list6;
                str2 = str4;
                bitmap = bitmapCk;
                bitmap2 = bitmapQie;
                bitmapN = aCVarN2.n();
            } else {
                z2 = z4;
                componentActivity = componentActivity3;
                iFVar = iFVar3;
                str = title;
                String str5 = quantityString;
                list = list6;
                str2 = str5;
                bitmapN = null;
                bitmap = bitmapCk;
                bitmap2 = bitmapQie;
            }
            Bitmap bitmapGh = nKK.gh(componentActivity, str, str2, ml, bitmap, bitmapN);
            Z z5 = new Z(c2.t(), bitmapMUb, DAz.f67201n, str);
            String strT2 = c2.t();
            DAz dAz = DAz.f67202t;
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(z5, new Z(strT2, bitmap2, dAz, str + str2), new Z(c2.t(), bitmapQie2, dAz, str + str2), new Z(c2.t(), bitmapGh, dAz, str + str2));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(componentActivity).o(2132020384).Z(2131558823).KN(componentActivity.getString(z3 ? 2132019902 : z2 ? 2132020153 : 2132019983)).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: gIX.Wre
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    Dsr.j.mUb(dialogInterface, i3);
                }
            }).create();
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            alertDialogCreate.show();
            ConstraintLayout constraintLayout = (ConstraintLayout) alertDialogCreate.findViewById(2131363077);
            TextView textView = (TextView) alertDialogCreate.findViewById(2131363078);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(c2.rl() ? 0 : 8);
            }
            if (c2.rl()) {
                if (c2.nr()) {
                    string = componentActivity.getResources().getString(2132020402);
                } else {
                    string = componentActivity.getResources().getString(2132020402) + " (" + componentActivity.getResources().getString(2132019606) + ")";
                }
                Intrinsics.checkNotNull(string);
                if (textView != null) {
                    textView.setText(string);
                }
                String string3 = componentActivity.getResources().getString(2132020396, com.alightcreative.app.motion.activities.lej.t(c2.O(), false, 1, null));
                if (c2.nr()) {
                    string2 = componentActivity.getResources().getString(2132020398) + "\n" + componentActivity.getResources().getString(2132020401);
                } else {
                    string2 = componentActivity.getResources().getString(2132020400);
                    Intrinsics.checkNotNull(string2);
                }
                final String str6 = string3 + "\n\n" + string2;
                if (constraintLayout != null) {
                    constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: gIX.CN3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Dsr.j.gh(componentActivity, string, str6, view);
                        }
                    });
                }
            }
            RecyclerViewEx recyclerViewEx = (RecyclerViewEx) alertDialogCreate.findViewById(2131363445);
            if (recyclerViewEx != null) {
                recyclerViewEx.setLayoutManager(new LinearLayoutManager(componentActivity, 0, false));
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProjectInfo.n) it.next()).getId());
                }
                ComponentActivity componentActivity4 = componentActivity;
                recyclerViewEx.setAdapter(new M(arrayListArrayListOf, componentActivity4, iFVar, arrayList, list));
                recyclerViewEx.addItemDecoration(new xq(0, componentActivity4.getResources().getDimensionPixelOffset(2131166251), 0, 0));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void qie(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public static final void J2(final ComponentActivity componentActivity, List selectedPresets, final iF eventLogger, final kgE.fuX iapManager, final List snapshots) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(selectedPresets, "selectedPresets");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedPresets, 10));
        Iterator it = selectedPresets.iterator();
        while (it.hasNext()) {
            arrayList.add(SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(componentActivity, ((C1960j) it.next()).t()), null, 1, null), false, false, false, 14, null));
        }
        final List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        int i2 = 0;
        for (Object obj : mutableList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(SceneKt.getProjectInfo((Scene) obj, HI0.afx.o(componentActivity, ((C1960j) selectedPresets.get(i2)).t())));
            i2 = i3;
        }
        new AlertDialog.Builder(componentActivity).setTitle(componentActivity.getResources().getQuantityString(2131886124, mutableList.size(), Integer.valueOf(mutableList.size()))).Uo(2132019900).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: gIX.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                Dsr.Uo(dialogInterface, i5);
            }
        }).setPositiveButton(2132019903, new DialogInterface.OnClickListener() { // from class: gIX.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                Dsr.KN(componentActivity, arrayList2, eventLogger, iapManager, mutableList, snapshots, dialogInterface, i5);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void gh(iF iFVar, boolean z2, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.Z5b(z2 ? rWZ.Pl.J2 : rWZ.Pl.f73064t));
        iFVar.n(new j.fuX("share_projectpkg_logincancel", null, 2, 0 == true ? 1 : 0));
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void mUb(ComponentActivity componentActivity, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, boolean z2, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            sceneThumbnailMaker = null;
        }
        xMQ(componentActivity, list, iFVar, fux, list2, list3, sceneThumbnailMaker, (i2 & 64) != 0 ? false : z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void qie(final iF iFVar, boolean z2, final ComponentActivity componentActivity, final List list, final kgE.fuX fux, final List list2, final List list3, final SceneThumbnailMaker sceneThumbnailMaker, final boolean z3, DialogInterface dialogInterface, int i2) {
        iFVar.n(new j.eh(z2 ? rWZ.Xo.f73069S : rWZ.Xo.f73075t));
        iFVar.n(new j.fuX("share_projectpkg_login", null, 2, 0 == true ? 1 : 0));
        dialogInterface.dismiss();
        PJ9.DAz.fD(componentActivity, new Function0() { // from class: gIX.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.az(componentActivity, list, iFVar, fux, list2, list3, sceneThumbnailMaker, z3);
            }
        });
    }

    public static final void xMQ(final ComponentActivity componentActivity, final List selectedProjects, final iF eventLogger, final kgE.fuX iapManager, final List scenes, final List snapshots, final SceneThumbnailMaker sceneThumbnailMaker, final boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(selectedProjects, "selectedProjects");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        boolean z3 = true;
        if (selectedProjects == null || !selectedProjects.isEmpty()) {
            Iterator it = selectedProjects.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ProjectInfo.n) it.next()).getType() != SceneType.PRESET) {
                    z3 = false;
                    break;
                }
            }
        }
        final boolean z4 = z3;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        String uid = firebaseAuth.getUid();
        if (uid != null) {
            GJW.C.nr(LifecycleOwnerKt.n(componentActivity), null, null, new j(componentActivity, uid, selectedProjects, eventLogger, iapManager, scenes, snapshots, sceneThumbnailMaker, z4, z2, null), 3, null);
        } else {
            eventLogger.n(new j.qfL(z4 ? rWZ.Pl.J2 : rWZ.Pl.f73064t));
            new AlertDialog.Builder(componentActivity).o(2132020173).Uo(z4 ? 2132019901 : 2132020172).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: gIX.w6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Dsr.gh(eventLogger, z4, dialogInterface, i2);
                }
            }).setPositiveButton(2132020171, new DialogInterface.OnClickListener() { // from class: gIX.Ml
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Dsr.qie(eventLogger, z4, componentActivity, selectedProjects, iapManager, scenes, snapshots, sceneThumbnailMaker, z2, dialogInterface, i2);
                }
            }).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(ComponentActivity componentActivity, List list, iF iFVar, kgE.fuX fux, List list2, List list3, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        mUb(componentActivity, list, iFVar, fux, list2, list3, null, false, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(ComponentActivity componentActivity, List list, iF iFVar, kgE.fuX fux, List list2, List list3, SceneThumbnailMaker sceneThumbnailMaker, boolean z2) {
        xMQ(componentActivity, list, iFVar, fux, list2, list3, sceneThumbnailMaker, z2);
        return Unit.INSTANCE;
    }
}
