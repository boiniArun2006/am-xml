package com.alightcreative.app.motion.activities.audiobrowser;

import CHm.j;
import HI0.Zs;
import HI0.l4Z;
import QmE.iF;
import SJ0.C1461n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity;
import com.alightcreative.app.motion.activities.audiobrowser.j;
import com.alightcreative.app.motion.persist.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m.C2282c;
import tu.Ew;
import tu.Z;
import tu.ci;
import tu.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00108R \u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0H0G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/alightcreative/app/motion/activities/audiobrowser/AudioBrowserActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "qm", "Lcom/alightcreative/app/motion/persist/j$j;", "mode", "mYa", "(Lcom/alightcreative/app/motion/persist/j$j;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "browserMode", "LD5a/Dsr;", "bucketMode", "bucketId", "UhV", "(Lcom/alightcreative/app/motion/persist/j$j;LD5a/Dsr;Ljava/lang/String;)V", "Ltu/Z;", "media", "EWS", "(Ltu/Z;)V", "LSJ0/n;", "r", "LSJ0/n;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "Rl", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "Z", "Lcom/alightcreative/app/motion/persist/j$j;", "audioBrowserMode", "S", "LD5a/Dsr;", "g", "Ljava/lang/String;", "Lcom/alightcreative/app/motion/activities/audiobrowser/j;", "E2", "Lcom/alightcreative/app/motion/activities/audiobrowser/j;", "audioBucketUpdateListener", "", "e", "forInitializeCategory", "", "Lm/c;", "X", "Ljava/util/List;", "categoryItems", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "projectId", "LHI0/l4Z;", "", "N", "LHI0/l4Z;", "audioListLoader", "v", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioBrowserActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioBrowserActivity.kt\ncom/alightcreative/app/motion/activities/audiobrowser/AudioBrowserActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,399:1\n1#2:400\n161#3,8:401\n1544#4:409\n1544#4:417\n1053#4:425\n1544#4:426\n774#4:434\n865#4,2:435\n774#4:437\n865#4,2:438\n774#4:440\n865#4,2:441\n774#4:443\n865#4,2:444\n1544#4:446\n1544#4:454\n1544#4:462\n1053#4:470\n1544#4:471\n53#5:410\n80#5,6:411\n53#5:418\n80#5,6:419\n53#5:427\n80#5,6:428\n53#5:447\n80#5,6:448\n53#5:455\n80#5,6:456\n53#5:463\n80#5,6:464\n53#5:472\n80#5,6:473\n*S KotlinDebug\n*F\n+ 1 AudioBrowserActivity.kt\ncom/alightcreative/app/motion/activities/audiobrowser/AudioBrowserActivity\n*L\n69#1:401,8\n174#1:409\n183#1:417\n193#1:425\n193#1:426\n214#1:434\n214#1:435,2\n218#1:437\n218#1:438,2\n222#1:440\n222#1:441,2\n226#1:443\n226#1:444,2\n233#1:446\n244#1:454\n255#1:462\n267#1:470\n267#1:471\n175#1:410\n175#1:411,6\n184#1:418\n184#1:419,6\n194#1:427\n194#1:428,6\n234#1:447\n234#1:448,6\n245#1:455\n245#1:456,6\n256#1:463\n256#1:464,6\n268#1:472\n268#1:473,6\n*E\n"})
public final class AudioBrowserActivity extends com.alightcreative.app.motion.activities.audiobrowser.Ml {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private j audioBucketUpdateListener;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private String projectId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean forInitializeCategory;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private C1461n binding;
    public static final int Xw = 8;
    private static final ExecutorService jB = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private j.EnumC0648j audioBrowserMode = com.alightcreative.app.motion.persist.j.INSTANCE.getAudioBrowserMode();

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private D5a.Dsr bucketMode = D5a.Dsr.f1304r;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String bucketId = "";

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private List categoryItems = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final l4Z audioListLoader = new l4Z(jB, new Function0() { // from class: m.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AudioBrowserActivity.n1(this.f70577n);
        }
    }).KN(new Function1() { // from class: m.Wre
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AudioBrowserActivity.Jk(this.f70581n, (Collection) obj);
        }
    });

    public static final class C implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((Z) obj).r(), ((Z) obj2).r());
        }
    }

    public static final class CN3 implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44878n;

        public CN3(Iterable iterable) {
            this.f44878n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).KN();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44878n.iterator();
        }
    }

    public static final class Dsr implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44879n;

        public Dsr(Iterable iterable) {
            this.f44879n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).J2();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44879n.iterator();
        }
    }

    public static final class I28 implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44880n;

        public I28(Iterable iterable) {
            this.f44880n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).J2();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44880n.iterator();
        }
    }

    public static final class Ml implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44881n;

        public Ml(Iterable iterable) {
            this.f44881n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).t();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44881n.iterator();
        }
    }

    public static final class Wre implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44882n;

        public Wre(Iterable iterable) {
            this.f44882n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return Long.valueOf(((Z) obj).Ik());
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44882n.iterator();
        }
    }

    public static final class aC implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44883n;

        public aC(Iterable iterable) {
            this.f44883n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return Long.valueOf(((Z) obj).Ik());
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44883n.iterator();
        }
    }

    public static final class fuX implements Grouping {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Iterable f44884n;

        public fuX(Iterable iterable) {
            this.f44884n = iterable;
        }

        @Override // kotlin.collections.Grouping
        public Object keyOf(Object obj) {
            return ((Z) obj).t();
        }

        @Override // kotlin.collections.Grouping
        public Iterator sourceIterator() {
            return this.f44884n.iterator();
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[D5a.Dsr.values().length];
            try {
                iArr[D5a.Dsr.f1300O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D5a.Dsr.f1305t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D5a.Dsr.f1302n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j.EnumC0648j.values().length];
            try {
                iArr2[j.EnumC0648j.f45857r.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j.EnumC0648j.f45858t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[j.EnumC0648j.f45853O.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[j.EnumC0648j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[j.EnumC0648j.f45855n.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Ew.values().length];
            try {
                iArr3[Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final class o implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((Z) obj).r(), ((Z) obj2).r());
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, AudioBrowserActivity.class, "onCategorySelected", "onCategorySelected(Lcom/alightcreative/app/motion/persist/Persist$AudioBrowserMode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((j.EnumC0648j) obj);
            return Unit.INSTANCE;
        }

        public final void n(j.EnumC0648j p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AudioBrowserActivity) this.receiver).mYa(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n1(AudioBrowserActivity audioBrowserActivity) {
        Z zRl;
        Z zRl2;
        Z zRl3;
        Z zRl4;
        Z zRl5;
        Z zRl6;
        Z zRl7;
        if (!XoT.fuX.ty(audioBrowserActivity)) {
            return CollectionsKt.emptyList();
        }
        if (audioBrowserActivity.forInitializeCategory) {
            Ew ew = Ew.f73883o;
            Set of = SetsKt.setOf(ew);
            g9s.j jVar = g9s.f73966t;
            int size = ci.KN(audioBrowserActivity, of, jVar.t()).size();
            Ml ml = new Ml(ci.KN(audioBrowserActivity, SetsKt.setOf(ew), jVar.n()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator itSourceIterator = ml.sourceIterator();
            while (itSourceIterator.hasNext()) {
                Object next = itSourceIterator.next();
                Object objKeyOf = ml.keyOf(next);
                Object obj = linkedHashMap.get(objKeyOf);
                Z z2 = (Z) next;
                Z z3 = (Z) obj;
                if (obj == null && !linkedHashMap.containsKey(objKeyOf)) {
                    zRl7 = Z.rl(z2, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z3);
                    zRl7 = Z.rl(z3, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z3.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap.put(objKeyOf, zRl7);
            }
            int size2 = linkedHashMap.values().size();
            I28 i28 = new I28(ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n()));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator itSourceIterator2 = i28.sourceIterator();
            while (itSourceIterator2.hasNext()) {
                Object next2 = itSourceIterator2.next();
                Object objKeyOf2 = i28.keyOf(next2);
                Object obj2 = linkedHashMap2.get(objKeyOf2);
                Z z4 = (Z) next2;
                Z z5 = (Z) obj2;
                if (obj2 == null && !linkedHashMap2.containsKey(objKeyOf2)) {
                    zRl6 = Z.rl(z4, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z5);
                    zRl6 = Z.rl(z5, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z5.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap2.put(objKeyOf2, zRl6);
            }
            int size3 = linkedHashMap2.values().size();
            List listKN = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n());
            ci.nr(listKN, audioBrowserActivity);
            Wre wre = new Wre(CollectionsKt.sortedWith(listKN, new C()));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator itSourceIterator3 = wre.sourceIterator();
            while (itSourceIterator3.hasNext()) {
                Object next3 = itSourceIterator3.next();
                Object objKeyOf3 = wre.keyOf(next3);
                Object obj3 = linkedHashMap3.get(objKeyOf3);
                boolean z6 = obj3 == null && !linkedHashMap3.containsKey(objKeyOf3);
                Z z7 = (Z) next3;
                Z z9 = (Z) obj3;
                ((Number) objKeyOf3).longValue();
                if (z6) {
                    zRl5 = Z.rl(z7, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z9);
                    zRl5 = Z.rl(z9, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z9.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap3.put(objKeyOf3, zRl5);
            }
            int size4 = linkedHashMap3.values().size();
            j.EnumC0648j enumC0648j = j.EnumC0648j.f45855n;
            String string = audioBrowserActivity.getResources().getString(2132017290);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Drawable drawable = audioBrowserActivity.getResources().getDrawable(2131231539, audioBrowserActivity.getTheme());
            Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
            C2282c c2282c = new C2282c(enumC0648j, string, drawable, size);
            j.EnumC0648j enumC0648j2 = j.EnumC0648j.f45858t;
            String string2 = audioBrowserActivity.getResources().getString(2132017284);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Drawable drawable2 = audioBrowserActivity.getResources().getDrawable(2131231536, audioBrowserActivity.getTheme());
            Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
            C2282c c2282c2 = new C2282c(enumC0648j2, string2, drawable2, size2);
            j.EnumC0648j enumC0648j3 = j.EnumC0648j.f45853O;
            String string3 = audioBrowserActivity.getResources().getString(2132017285);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            Drawable drawable3 = audioBrowserActivity.getResources().getDrawable(2131231537, audioBrowserActivity.getTheme());
            Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
            C2282c c2282c3 = new C2282c(enumC0648j3, string3, drawable3, size3);
            j.EnumC0648j enumC0648j4 = j.EnumC0648j.J2;
            String string4 = audioBrowserActivity.getResources().getString(2132017288);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            Drawable drawable4 = audioBrowserActivity.getResources().getDrawable(2131231538, audioBrowserActivity.getTheme());
            Intrinsics.checkNotNullExpressionValue(drawable4, "getDrawable(...)");
            audioBrowserActivity.categoryItems = CollectionsKt.listOf((Object[]) new C2282c[]{c2282c, c2282c2, c2282c3, new C2282c(enumC0648j4, string4, drawable4, size4)});
            return CollectionsKt.emptyList();
        }
        D5a.Dsr dsr = audioBrowserActivity.bucketMode;
        if (dsr != D5a.Dsr.f1304r) {
            int i2 = n.$EnumSwitchMapping$0[dsr.ordinal()];
            if (i2 == 1) {
                List listKN2 = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.t());
                ci.nr(listKN2, audioBrowserActivity);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : listKN2) {
                    if (((Z) obj4).Ik() == Long.parseLong(audioBrowserActivity.bucketId)) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            }
            if (i2 == 2) {
                List listKN3 = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.t());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : listKN3) {
                    if (Intrinsics.areEqual(((Z) obj5).J2(), audioBrowserActivity.bucketId)) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            }
            if (i2 != 3) {
                List listKN4 = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : listKN4) {
                    if (Intrinsics.areEqual(((Z) obj6).KN(), audioBrowserActivity.bucketId)) {
                        arrayList3.add(obj6);
                    }
                }
                return arrayList3;
            }
            List listKN5 = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.t());
            ArrayList arrayList4 = new ArrayList();
            for (Object obj7 : listKN5) {
                if (((Z) obj7).O() == Long.parseLong(audioBrowserActivity.bucketId)) {
                    arrayList4.add(obj7);
                }
            }
            return arrayList4;
        }
        int i3 = n.$EnumSwitchMapping$1[audioBrowserActivity.audioBrowserMode.ordinal()];
        if (i3 == 1) {
            CN3 cn3 = new CN3(ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n()));
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            Iterator itSourceIterator4 = cn3.sourceIterator();
            while (itSourceIterator4.hasNext()) {
                Object next4 = itSourceIterator4.next();
                Object objKeyOf4 = cn3.keyOf(next4);
                Object obj8 = linkedHashMap4.get(objKeyOf4);
                Z z10 = (Z) next4;
                Z z11 = (Z) obj8;
                if (obj8 == null && !linkedHashMap4.containsKey(objKeyOf4)) {
                    zRl = Z.rl(z10, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z11);
                    zRl = Z.rl(z11, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z11.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap4.put(objKeyOf4, zRl);
            }
            return linkedHashMap4.values();
        }
        if (i3 == 2) {
            fuX fux = new fuX(ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n()));
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            Iterator itSourceIterator5 = fux.sourceIterator();
            while (itSourceIterator5.hasNext()) {
                Object next5 = itSourceIterator5.next();
                Object objKeyOf5 = fux.keyOf(next5);
                Object obj9 = linkedHashMap5.get(objKeyOf5);
                Z z12 = (Z) next5;
                Z z13 = (Z) obj9;
                if (obj9 == null && !linkedHashMap5.containsKey(objKeyOf5)) {
                    zRl2 = Z.rl(z12, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z13);
                    zRl2 = Z.rl(z13, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z13.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap5.put(objKeyOf5, zRl2);
            }
            return linkedHashMap5.values();
        }
        if (i3 == 3) {
            Dsr dsr2 = new Dsr(ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n()));
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            Iterator itSourceIterator6 = dsr2.sourceIterator();
            while (itSourceIterator6.hasNext()) {
                Object next6 = itSourceIterator6.next();
                Object objKeyOf6 = dsr2.keyOf(next6);
                Object obj10 = linkedHashMap6.get(objKeyOf6);
                Z z14 = (Z) next6;
                Z z15 = (Z) obj10;
                if (obj10 == null && !linkedHashMap6.containsKey(objKeyOf6)) {
                    zRl3 = Z.rl(z14, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
                } else {
                    Intrinsics.checkNotNull(z15);
                    zRl3 = Z.rl(z15, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z15.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
                }
                linkedHashMap6.put(objKeyOf6, zRl3);
            }
            return linkedHashMap6.values();
        }
        if (i3 != 4) {
            if (i3 == 5) {
                return ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.t());
            }
            throw new NoWhenBranchMatchedException();
        }
        List listKN6 = ci.KN(audioBrowserActivity, SetsKt.setOf(Ew.f73883o), g9s.f73966t.n());
        ci.nr(listKN6, audioBrowserActivity);
        aC aCVar = new aC(CollectionsKt.sortedWith(listKN6, new o()));
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        Iterator itSourceIterator7 = aCVar.sourceIterator();
        while (itSourceIterator7.hasNext()) {
            Object next7 = itSourceIterator7.next();
            Object objKeyOf7 = aCVar.keyOf(next7);
            Object obj11 = linkedHashMap7.get(objKeyOf7);
            boolean z16 = obj11 == null && !linkedHashMap7.containsKey(objKeyOf7);
            Z z17 = (Z) next7;
            Z z18 = (Z) obj11;
            ((Number) objKeyOf7).longValue();
            if (z16) {
                zRl4 = Z.rl(z17, null, Ew.f73880Z, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217533, null);
            } else {
                Intrinsics.checkNotNull(z18);
                zRl4 = Z.rl(z18, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, z18.xMQ() + 1, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073217535, null);
            }
            linkedHashMap7.put(objKeyOf7, zRl4);
        }
        return linkedHashMap7.values();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String stringExtra;
        if (requestCode != 2) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == -1) {
            Ew ew = null;
            Uri uri = data != null ? (Uri) data.getParcelableExtra("selectedUri") : null;
            if (data != null && (stringExtra = data.getStringExtra("mediaType")) != null) {
                ew = (Ew) HI0.Ew.n(Ew.values(), stringExtra);
            }
            if (uri == null || ew == null) {
                return;
            }
            setResult(-1, new Intent().putExtra("selectedUri", uri).putExtra("mediaType", ew.name()));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GD(final AudioBrowserActivity audioBrowserActivity, View view) {
        HI0.Ml.ty(audioBrowserActivity, j.n.KN, 0, null, new Function0() { // from class: m.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioBrowserActivity.Po6(this.f70576n);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Jk(AudioBrowserActivity audioBrowserActivity, Collection mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        C1461n c1461n = null;
        if (XoT.fuX.ty(audioBrowserActivity)) {
            if (audioBrowserActivity.forInitializeCategory) {
                C1461n c1461n2 = audioBrowserActivity.binding;
                if (c1461n2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c1461n2 = null;
                }
                c1461n2.nr.setAdapter(new com.alightcreative.app.motion.activities.audiobrowser.w6(audioBrowserActivity.categoryItems, new w6(audioBrowserActivity)));
                audioBrowserActivity.forInitializeCategory = false;
            }
            C1461n c1461n3 = audioBrowserActivity.binding;
            if (c1461n3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n3 = null;
            }
            c1461n3.nr.setVisibility(0);
            C1461n c1461n4 = audioBrowserActivity.binding;
            if (c1461n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n4 = null;
            }
            c1461n4.xMQ.setVisibility(8);
            C1461n c1461n5 = audioBrowserActivity.binding;
            if (c1461n5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1461n = c1461n5;
            }
            c1461n.rl.setVisibility(8);
            j jVar = audioBrowserActivity.audioBucketUpdateListener;
            if (jVar != null) {
                jVar.B(CollectionsKt.toMutableList(mediaList));
            }
        } else {
            C1461n c1461n6 = audioBrowserActivity.binding;
            if (c1461n6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n6 = null;
            }
            c1461n6.nr.setVisibility(8);
            C1461n c1461n7 = audioBrowserActivity.binding;
            if (c1461n7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n7 = null;
            }
            c1461n7.xMQ.setVisibility(0);
            C1461n c1461n8 = audioBrowserActivity.binding;
            if (c1461n8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1461n = c1461n8;
            }
            c1461n.rl.setVisibility(0);
            while (audioBrowserActivity.getSupportFragmentManager().Jk() > 0) {
                audioBrowserActivity.getSupportFragmentManager().uG();
            }
        }
        return Unit.INSTANCE;
    }

    public final void EWS(Z media) {
        String str;
        j jVarRl;
        Intrinsics.checkNotNullParameter(media, "media");
        int i2 = n.$EnumSwitchMapping$2[media.ViF().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return;
        }
        if (i2 == 3) {
            setResult(-1, new Intent().putExtra("selectedUri", media.nY()).putExtra("mediaType", media.ViF().name()));
            finish();
            return;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        int i3 = n.$EnumSwitchMapping$1[this.audioBrowserMode.ordinal()];
        if (i3 == 2) {
            long jO = media.O();
            Fragment fragmentPJg = getSupportFragmentManager().pJg("AudioBucketFragment:" + jO);
            if (fragmentPJg != null) {
                fragmentTransactionO.r(fragmentPJg);
            }
            j.Companion companion = j.INSTANCE;
            String strName = this.audioBrowserMode.name();
            Long lValueOf = Long.valueOf(jO);
            String strT = media.t();
            if (strT == null) {
                String strAYN = media.aYN();
                str = strAYN == null ? "?" : strAYN;
            } else {
                str = strT;
            }
            jVarRl = j.Companion.rl(companion, strName, null, null, null, lValueOf, str, null, null, Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE, null);
        } else if (i3 == 3) {
            String strJ2 = media.J2();
            if (strJ2 == null) {
                return;
            }
            Fragment fragmentPJg2 = getSupportFragmentManager().pJg("AudioBucketFragment:" + strJ2);
            if (fragmentPJg2 != null) {
                fragmentTransactionO.r(fragmentPJg2);
            }
            jVarRl = j.Companion.rl(j.INSTANCE, this.audioBrowserMode.name(), null, null, strJ2, null, null, null, null, 246, null);
        } else if (i3 != 4) {
            String strKN = media.KN();
            if (strKN == null) {
                return;
            }
            Fragment fragmentPJg3 = getSupportFragmentManager().pJg("AudioBucketFragment:" + strKN);
            if (fragmentPJg3 != null) {
                fragmentTransactionO.r(fragmentPJg3);
            }
            j.Companion companion2 = j.INSTANCE;
            String strName2 = this.audioBrowserMode.name();
            String strUo = media.Uo();
            jVarRl = j.Companion.rl(companion2, strName2, null, null, null, null, null, strKN, strUo == null ? "?" : strUo, 62, null);
        } else {
            long jIk = media.Ik();
            Fragment fragmentPJg4 = getSupportFragmentManager().pJg("AudioBucketFragment:" + jIk);
            if (fragmentPJg4 != null) {
                fragmentTransactionO.r(fragmentPJg4);
            }
            j.Companion companion3 = j.INSTANCE;
            String strName3 = this.audioBrowserMode.name();
            Long lValueOf2 = Long.valueOf(jIk);
            String strR = media.r();
            jVarRl = j.Companion.rl(companion3, strName3, lValueOf2, strR == null ? "?" : strR, null, null, null, null, null, 248, null);
        }
        this.audioBucketUpdateListener = jVarRl;
        String str2 = "AudioBucketFragment:" + this.bucketId;
        L.j.rl(fragmentTransactionO).t(2131362838, jVarRl, str2).KN(str2).mUb();
    }

    public final iF Rl() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void UhV(j.EnumC0648j browserMode, D5a.Dsr bucketMode, String bucketId) {
        Intrinsics.checkNotNullParameter(browserMode, "browserMode");
        Intrinsics.checkNotNullParameter(bucketMode, "bucketMode");
        Intrinsics.checkNotNullParameter(bucketId, "bucketId");
        this.audioBrowserMode = browserMode;
        this.bucketMode = bucketMode;
        this.bucketId = bucketId;
        this.audioListLoader.nr();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 1) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        iF iFVarRl = Rl();
        boolean z2 = !(grantResults.length == 0) && grantResults[0] == 0;
        rWZ.fuX fux = rWZ.fuX.f73091t;
        String str = this.projectId;
        Zs.t(iFVarRl, z2, fux, str != null ? new String[]{str} : null, null, null, new Function0() { // from class: m.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioBrowserActivity.hRu(this.f70578n);
            }
        }, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HV(AudioBrowserActivity audioBrowserActivity, View view) {
        audioBrowserActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat Org(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Po6(AudioBrowserActivity audioBrowserActivity) {
        audioBrowserActivity.qm();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hRu(AudioBrowserActivity audioBrowserActivity) {
        audioBrowserActivity.qm();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mYa(j.EnumC0648j mode) {
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = getSupportFragmentManager().pJg("AudioBucketFragment:" + mode.name());
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.KN(null);
        j jVarRl = j.Companion.rl(j.INSTANCE, mode.name(), null, null, null, null, null, null, null, 254, null);
        String str = "AudioBucketFragment:" + mode.name();
        this.audioBucketUpdateListener = jVarRl;
        L.j.rl(fragmentTransactionO).t(2131362838, jVarRl, str).KN(str).mUb();
    }

    private final void qm() {
        C1461n c1461n = null;
        if (XoT.fuX.ty(this)) {
            this.forInitializeCategory = true;
            C1461n c1461n2 = this.binding;
            if (c1461n2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n2 = null;
            }
            c1461n2.nr.setVisibility(0);
            C1461n c1461n3 = this.binding;
            if (c1461n3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n3 = null;
            }
            c1461n3.xMQ.setVisibility(8);
            C1461n c1461n4 = this.binding;
            if (c1461n4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1461n4 = null;
            }
            c1461n4.rl.setVisibility(8);
            C1461n c1461n5 = this.binding;
            if (c1461n5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c1461n = c1461n5;
            }
            RecyclerView recyclerView = c1461n.nr;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
            linearLayoutManager.MPw(10);
            linearLayoutManager.Ro(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            this.audioListLoader.nr();
            return;
        }
        C1461n c1461n6 = this.binding;
        if (c1461n6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1461n6 = null;
        }
        c1461n6.nr.setVisibility(8);
        C1461n c1461n7 = this.binding;
        if (c1461n7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1461n7 = null;
        }
        c1461n7.xMQ.setVisibility(0);
        C1461n c1461n8 = this.binding;
        if (c1461n8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1461n = c1461n8;
        }
        c1461n.rl.setVisibility(0);
    }

    @Override // com.alightcreative.app.motion.activities.audiobrowser.Ml, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        C1461n c1461nT = C1461n.t(getLayoutInflater());
        this.binding = c1461nT;
        C1461n c1461n = null;
        if (c1461nT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1461nT = null;
        }
        setContentView(c1461nT.getRoot());
        C1461n c1461n2 = this.binding;
        if (c1461n2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1461n2 = null;
        }
        ViewCompat.Org(c1461n2.getRoot(), new OnApplyWindowInsetsListener() { // from class: m.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return AudioBrowserActivity.Org(view, windowInsetsCompat);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("projectId");
        } else {
            stringExtra = null;
        }
        this.projectId = stringExtra;
        C1461n c1461n3 = this.binding;
        if (c1461n3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1461n3 = null;
        }
        c1461n3.f9550t.setOnClickListener(new View.OnClickListener() { // from class: m.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioBrowserActivity.HV(this.f70588n, view);
            }
        });
        C1461n c1461n4 = this.binding;
        if (c1461n4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1461n = c1461n4;
        }
        c1461n.rl.setOnClickListener(new View.OnClickListener() { // from class: m.w6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioBrowserActivity.GD(this.f70592n, view);
            }
        });
        qm();
    }
}
