package com.alightcreative.app.motion.activities;

import QmE.j;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.zP;
import com.alightcreative.app.motion.fonts.AMTypefaceError;
import com.alightcreative.app.motion.persist.j;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import gP.C2121j;
import gP.EnumC2123w6;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zP extends RecyclerView.Adapter {
    private final Function1 J2;
    private final QmE.iF KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function2 f45759O;
    private final Function1 Uo;
    private final List gh;
    private List mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f45760n;
    private final Set nr;
    private final gP.Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f45761t;
    private final String xMQ;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SJ0.oXP f45762n;
        private com.alightcreative.app.motion.fonts.w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ zP f45763t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(zP zPVar, SJ0.oXP itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f45763t = zPVar;
            this.f45762n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(j jVar, com.alightcreative.app.motion.fonts.w6 w6Var, Result result, final C2121j c2121j) {
            if (Intrinsics.areEqual(jVar.rl, w6Var)) {
                Object value = result.getValue();
                if (Result.m319isFailureimpl(value)) {
                    value = null;
                }
                Typeface typeface = (Typeface) value;
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(result.getValue());
                if (typeface != null) {
                    XoT.C.HI(jVar, new Function0() { // from class: com.alightcreative.app.motion.activities.pR
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zP.j.WPU(c2121j);
                        }
                    });
                    jVar.f45762n.Uo.setTextColor(-1);
                    jVar.f45762n.Uo.setTypeface(typeface);
                    return;
                }
                AMTypefaceError.Companion companion = AMTypefaceError.INSTANCE;
                if (!Intrinsics.areEqual(thM316exceptionOrNullimpl, companion.KN()) && !Intrinsics.areEqual(thM316exceptionOrNullimpl, companion.xMQ()) && !Intrinsics.areEqual(thM316exceptionOrNullimpl, companion.rl())) {
                    XoT.C.HI(jVar, new Function0() { // from class: com.alightcreative.app.motion.activities.X56
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zP.j.ViF(c2121j);
                        }
                    });
                    jVar.f45762n.Uo.setTextColor(-65536);
                    jVar.f45762n.f9581O.setVisibility(0);
                    jVar.f45762n.Uo.setVisibility(4);
                    return;
                }
                XoT.C.HI(jVar, new Function0() { // from class: com.alightcreative.app.motion.activities.BcZ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zP.j.aYN(c2121j);
                    }
                });
                jVar.f45762n.Uo.setTextColor(-65536);
                jVar.f45762n.f9581O.setVisibility(4);
                jVar.f45762n.rl.setVisibility(0);
                jVar.f45762n.Uo.setVisibility(4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit XQ(final j jVar, final com.alightcreative.app.motion.fonts.w6 w6Var, final C2121j c2121j, final Result result) {
            jVar.itemView.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.x4
                @Override // java.lang.Runnable
                public final void run() {
                    zP.j.S(this.f45721n, w6Var, result, c2121j);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(zP zPVar, com.alightcreative.app.motion.fonts.w6 w6Var, j jVar, boolean z2) {
            if (z2) {
                QmE.iF iFVar = zPVar.KN;
                Bundle bundle = new Bundle();
                bundle.putString("font", Intrinsics.areEqual(w6Var.n().t(), gP.qz.f67557n) ? w6Var.toString() : "imported");
                Unit unit = Unit.INSTANCE;
                iFVar.n(new j.fuX("font_favorite", bundle));
                zPVar.nr.add(w6Var);
                jVar.f45762n.f9583t.setActivated(true);
                com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                Set set = zPVar.nr;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.alightcreative.app.motion.fonts.w6) it.next()).toString());
                }
                jVar2.setFavoriteFonts(CollectionsKt.toSet(arrayList));
            }
            return Unit.INSTANCE;
        }

        public final void Ik(final com.alightcreative.app.motion.fonts.w6 amTypeface) {
            String str;
            Intrinsics.checkNotNullParameter(amTypeface, "amTypeface");
            final C2121j c2121jN = amTypeface.n();
            this.f45762n.Uo.setTextColor(587202559);
            this.f45762n.Uo.setTypeface(null);
            this.f45762n.f9581O.setVisibility(4);
            this.f45762n.rl.setVisibility(4);
            this.f45762n.Uo.setVisibility(0);
            List listListOf = CollectionsKt.listOf((Object[]) new gP.Xo[]{gP.Xo.f67531FX, gP.Xo.f67528B, gP.Xo.f67534N, gP.Xo.f67536T, gP.Xo.f67535S});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (c2121jN.nr().contains((gP.Xo) obj)) {
                    arrayList.add(obj);
                }
            }
            boolean z2 = arrayList.size() > 1;
            boolean z3 = !(c2121jN.t() instanceof gP.qz) || this.f45763t.gh.contains(com.alightcreative.app.motion.fonts.CN3.HI(amTypeface));
            if (z3) {
                TextView textView = this.f45762n.Uo;
                String str2 = "Abcdefg";
                if (!z2) {
                    if (c2121jN.nr().contains(gP.Xo.f67531FX)) {
                        str2 = "은하수 Abcd";
                    } else if (c2121jN.nr().contains(gP.Xo.f67528B)) {
                        str2 = "あいう Abcd";
                    } else if (c2121jN.nr().contains(gP.Xo.f67534N)) {
                        str2 = "اب Abcd";
                    } else if (c2121jN.nr().contains(gP.Xo.f67536T)) {
                        str2 = "कअ Abcd";
                    } else if (c2121jN.nr().contains(gP.Xo.f67535S)) {
                        str2 = "Abcd אק";
                    }
                }
                textView.setText(str2);
            } else {
                this.f45762n.Uo.setVisibility(4);
            }
            this.rl = amTypeface;
            this.f45762n.f9583t.setActivated(this.f45763t.nr.contains(amTypeface));
            this.f45762n.nr.setVisibility(c2121jN.t() instanceof gP.Pl ? 0 : 4);
            ImageButton imageButton = this.f45762n.nr;
            final zP zPVar = this.f45763t;
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dG
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zP.j.nY(c2121jN, this, zPVar, amTypeface, view);
                }
            });
            ImageButton imageButton2 = this.f45762n.f9583t;
            final zP zPVar2 = this.f45763t;
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.s9l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    zP.j.r(zPVar2, amTypeface, this, view);
                }
            });
            View view = this.itemView;
            final zP zPVar3 = this.f45763t;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.CVl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zP.j.Z(zPVar3, amTypeface, view2);
                }
            });
            if (z3) {
                this.f45762n.KN.setVisibility(4);
                com.alightcreative.app.motion.fonts.CN3.Z(amTypeface, new Function1() { // from class: com.alightcreative.app.motion.activities.Sm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return zP.j.XQ(this.f44758n, amTypeface, c2121jN, (Result) obj2);
                    }
                });
            } else {
                this.f45762n.KN.setVisibility(0);
                try {
                    this.itemView.getContext().getAssets().open("fontthumb/" + com.alightcreative.app.motion.fonts.CN3.HI(amTypeface) + ".webp").close();
                    str = "asset:///fontthumb/" + com.alightcreative.app.motion.fonts.CN3.HI(amTypeface) + ".webp";
                } catch (IOException unused) {
                    str = "https://alight-fonts.firebaseapp.com/appdata/fontthumbs/20180905A/webp/" + com.alightcreative.app.motion.fonts.CN3.HI(amTypeface) + ".webp";
                }
                this.f45762n.KN.setImageRequest(ImageRequestBuilder.aYN(Uri.parse(str)).N(new PLK.j(0, 1, null)).n());
            }
            if (this.f45763t.f45761t.length() <= 0) {
                this.f45762n.J2.setText(com.alightcreative.app.motion.fonts.CN3.HI(amTypeface));
                return;
            }
            int color = this.itemView.getContext().getColor(2131099798);
            String strHI = com.alightcreative.app.motion.fonts.CN3.HI(amTypeface);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strHI);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-5592406), 0, strHI.length(), 17);
            for (MatchResult matchResult : Regex.findAll$default(new Regex("(^| )" + Regex.INSTANCE.escape(this.f45763t.f45761t), RegexOption.IGNORE_CASE), strHI, 0, 2, null)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), matchResult.getRange().getFirst(), matchResult.getRange().getLast() + 1, 17);
            }
            this.f45762n.J2.setText(spannableStringBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ViF(C2121j c2121j) {
            return "Failed to get typeface: " + c2121j.rl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String WPU(C2121j c2121j) {
            return "Got typeface: " + c2121j.rl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Z(zP zPVar, com.alightcreative.app.motion.fonts.w6 w6Var, View view) {
            zPVar.o().invoke(w6Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String aYN(C2121j c2121j) {
            return "Failed to get typeface: " + c2121j.rl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void fD(zP zPVar, com.alightcreative.app.motion.fonts.w6 w6Var, File file, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            zPVar.r().invoke(w6Var);
            file.delete();
            int iIndexOf = zPVar.mUb.indexOf(w6Var);
            zPVar.mUb = CollectionsKt.minus(zPVar.mUb, w6Var);
            com.alightcreative.app.motion.fonts.CN3.X();
            zPVar.notifyItemRemoved(iIndexOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void iF(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nY(final C2121j c2121j, final j jVar, final zP zPVar, final com.alightcreative.app.motion.fonts.w6 w6Var, View view) {
            if (c2121j.t() instanceof gP.Pl) {
                Context applicationContext = IvA.n.rl().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                final File fileResolve = FilesKt.resolve(HI0.afx.xMQ(applicationContext), ((gP.Pl) c2121j.t()).n());
                new AlertDialog.Builder(jVar.itemView.getContext()).setTitle(c2121j.rl()).setMessage(jVar.itemView.getContext().getString(2132019407, DateFormat.getDateInstance(1).format(new Date(fileResolve.lastModified())), HI0.gnv.nr(fileResolve.length()))).setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.eUh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        zP.j.g(dialogInterface, i2);
                    }
                }).setNegativeButton(2132017663, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ivh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        zP.j.te(this.f45281n, c2121j, zPVar, w6Var, fileResolve, dialogInterface, i2);
                    }
                }).create().show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(final zP zPVar, final com.alightcreative.app.motion.fonts.w6 w6Var, final j jVar, View view) {
            if (zPVar.nr.contains(w6Var)) {
                zPVar.nr.remove(w6Var);
                jVar.f45762n.f9583t.setActivated(false);
                com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
                Set set = zPVar.nr;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.alightcreative.app.motion.fonts.w6) it.next()).toString());
                }
                jVar2.setFavoriteFonts(CollectionsKt.toSet(arrayList));
                return;
            }
            zPVar.Z().invoke(w6Var, new Function1() { // from class: com.alightcreative.app.motion.activities.ig3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return zP.j.o(zPVar, w6Var, jVar, ((Boolean) obj).booleanValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void te(j jVar, C2121j c2121j, final zP zPVar, final com.alightcreative.app.motion.fonts.w6 w6Var, final File file, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            new AlertDialog.Builder(jVar.itemView.getContext()).setTitle(2132017664).setMessage(c2121j.rl()).setPositiveButton(2132017396, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.GBq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i3) {
                    zP.j.iF(dialogInterface2, i3);
                }
            }).setNegativeButton(2132017650, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.zjc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i3) {
                    zP.j.fD(zPVar, w6Var, file, dialogInterface2, i3);
                }
            }).create().show();
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.w6.values().length];
            try {
                iArr[j.w6.f45874n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.w6.f45875t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((C2121j) obj).rl(), ((C2121j) obj2).rl());
        }
    }

    public zP(Set categories, gP.Xo xo, String filterString, Set favoriteFonts, Function2 prepareFavorite, Function1 onFontSelected, Function1 onBeforeFontDelete, QmE.iF eventLogger) throws InterruptedException {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(filterString, "filterString");
        Intrinsics.checkNotNullParameter(favoriteFonts, "favoriteFonts");
        Intrinsics.checkNotNullParameter(prepareFavorite, "prepareFavorite");
        Intrinsics.checkNotNullParameter(onFontSelected, "onFontSelected");
        Intrinsics.checkNotNullParameter(onBeforeFontDelete, "onBeforeFontDelete");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f45760n = categories;
        this.rl = xo;
        this.f45761t = filterString;
        this.nr = favoriteFonts;
        this.f45759O = prepareFavorite;
        this.J2 = onFontSelected;
        this.Uo = onBeforeFontDelete;
        this.KN = eventLogger;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = filterString.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.xMQ = lowerCase;
        List listIk = com.alightcreative.app.motion.fonts.CN3.Ik();
        int i2 = n.$EnumSwitchMapping$0[com.alightcreative.app.motion.persist.j.INSTANCE.getFontSorting().ordinal()];
        if (i2 == 1) {
            listIk = CollectionsKt.sortedWith(listIk, new w6());
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<C2121j> arrayList = new ArrayList();
        for (Object obj : listIk) {
            String strRl = ((C2121j) obj).rl();
            Locale ENGLISH2 = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
            String lowerCase2 = strRl.toLowerCase(ENGLISH2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!StringsKt.isBlank(lowerCase2)) {
                if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) (" " + this.xMQ), false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase2, this.xMQ, false, 2, (Object) null)) {
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C2121j c2121j : arrayList) {
            List listO = c2121j.O();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.alightcreative.app.motion.fonts.w6(c2121j, (gP.eO) it.next()));
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList2) {
            com.alightcreative.app.motion.fonts.w6 w6Var = (com.alightcreative.app.motion.fonts.w6) obj2;
            if ((this.f45760n.contains(EnumC2123w6.f67562g) && this.nr.contains(w6Var)) || (this.f45760n.contains(w6Var.n().n()) && (this.rl == null || w6Var.n().nr().contains(this.rl)))) {
                arrayList4.add(obj2);
            }
        }
        this.mUb = arrayList4;
        this.gh = CollectionsKt.listOf((Object[]) new String[]{"Rubik Light", "Rubik Light Italic", "Rubik Regular", "Rubik Regular Italic", "Rubik Medium", "Rubik Medium Italic", "Rubik Bold", "Rubik Bold Italic", "Rubik Black", "Rubik Black Italic", "David Libre Regular", "David Libre Medium", "David Libre Bold", "Padauk Bold", "Kumar One Regular", "Kosugi Regular", "Kosugi Maru Regular", "Kumar One Outline Regular"});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.oXP oxpT = SJ0.oXP.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(oxpT, "inflate(...)");
        return new j(this, oxpT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.Ik((com.alightcreative.app.motion.fonts.w6) this.mUb.get(i2));
    }

    public final Function2 Z() {
        return this.f45759O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mUb.size();
    }

    public final Function1 o() {
        return this.J2;
    }

    public final Function1 r() {
        return this.Uo;
    }
}
