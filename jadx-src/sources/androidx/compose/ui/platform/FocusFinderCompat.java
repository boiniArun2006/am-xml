package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import java.util.Collections;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0012\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\rR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "root", "Landroid/view/View;", "focused", "Uo", "(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/ViewGroup;", "", "direction", "J2", "(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/MutableObjectList;", "focusables", "t", "(Landroid/view/ViewGroup;Landroid/view/View;ILandroidx/collection/MutableObjectList;)Landroid/view/View;", "O", "(Landroidx/collection/MutableObjectList;Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;", "Landroidx/collection/ObjectList;", JavetError.PARAMETER_COUNT, "", "outLooped", "KN", "(Landroid/view/View;Landroidx/collection/ObjectList;I[Z)Landroid/view/View;", "xMQ", "id", "", "mUb", "(I)Z", "nr", "Landroid/graphics/Rect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/graphics/Rect;", "focusedRect", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "rl", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "userSpecifiedFocusComparator", "Landroidx/collection/MutableObjectList;", "tmpList", "Companion", "UserSpecifiedFocusComparator", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1#2:464\n*E\n"})
public final class FocusFinderCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Rect focusedRect = new Rect();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.ci
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View n(View view, View view2) {
            return FocusFinderCompat.gh(this.f33178n, view, view2);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableObjectList tmpList = new MutableObjectList(0, 1, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f32948O = 8;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 J2 = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };

    @Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/platform/FocusFinderCompat;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Landroidx/compose/ui/platform/FocusFinderCompat;", "instance", "androidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1", "FocusFinderThreadLocal", "Landroidx/compose/ui/platform/FocusFinderCompat$Companion$FocusFinderThreadLocal$1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FocusFinderCompat n() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.J2.get();
            Intrinsics.checkNotNull(focusFinderCompat);
            return focusFinderCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003:\u0001(B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator;", "Ljava/util/Comparator;", "Landroid/view/View;", "Lkotlin/Comparator;", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "mNextFocusGetter", "<init>", "(Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;)V", "", "rl", "()V", "Landroidx/collection/ObjectList;", "focusables", "root", "t", "(Landroidx/collection/ObjectList;Landroid/view/View;)V", TtmlNode.TAG_HEAD, "nr", "(Landroid/view/View;)V", "first", "second", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;Landroid/view/View;)I", "Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "nextFoci", "Landroidx/collection/MutableScatterSet;", "O", "Landroidx/collection/MutableScatterSet;", "isConnectedTo", "J2", "headsOfChains", "Landroidx/collection/MutableObjectIntMap;", "r", "Landroidx/collection/MutableObjectIntMap;", "originalOrdinal", "o", "Landroid/view/View;", "NextFocusGetter", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,463:1\n301#2,6:464\n84#2:470\n84#2:471\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator\n*L\n265#1:464,6\n267#1:470\n276#1:471\n*E\n"})
    static final class UserSpecifiedFocusComparator implements Comparator<View> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final NextFocusGetter mNextFocusGetter;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private View root;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final MutableScatterMap nextFoci = ScatterMapKt.t();

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final MutableScatterSet isConnectedTo = ScatterSetKt.n();

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final MutableScatterMap headsOfChains = ScatterMapKt.t();

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final MutableObjectIntMap originalOrdinal = ObjectIntMapKt.rl();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/FocusFinderCompat$UserSpecifiedFocusComparator$NextFocusGetter;", "", "Landroid/view/View;", "root", "view", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/view/View;Landroid/view/View;)Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface NextFocusGetter {
            View n(View root, View view);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(View first, View second) {
            if (first == second) {
                return 0;
            }
            if (first == null) {
                return -1;
            }
            if (second == null) {
                return 1;
            }
            View view = (View) this.headsOfChains.O(first);
            View view2 = (View) this.headsOfChains.O(second);
            if (view == view2 && view != null) {
                if (first == view) {
                    return -1;
                }
                return (second == view || this.nextFoci.O(first) == null) ? 1 : -1;
            }
            if (view != null) {
                first = view;
            }
            if (view2 != null) {
                second = view2;
            }
            if (view == null && view2 == null) {
                return 0;
            }
            return this.originalOrdinal.t(first) < this.originalOrdinal.t(second) ? -1 : 1;
        }

        public final void nr(View head) {
            View view = head;
            while (head != null) {
                View view2 = (View) this.headsOfChains.O(head);
                if (view2 != null) {
                    if (view2 == view) {
                        return;
                    }
                    head = view;
                    view = view2;
                }
                this.headsOfChains.aYN(head, view);
                head = (View) this.nextFoci.O(head);
            }
        }

        public final void rl() {
            this.root = null;
            this.headsOfChains.gh();
            this.isConnectedTo.ty();
            this.originalOrdinal.mUb();
            this.nextFoci.gh();
        }

        public final void t(ObjectList focusables, View root) {
            this.root = root;
            Object[] objArr = focusables.content;
            int i2 = focusables._size;
            for (int i3 = 0; i3 < i2; i3++) {
                this.originalOrdinal.XQ((View) objArr[i3], i3);
            }
            IntRange intRangeUntil = RangesKt.until(0, focusables._size);
            int first = intRangeUntil.getFirst();
            int last = intRangeUntil.getLast();
            if (first <= last) {
                while (true) {
                    View view = (View) focusables.nr(last);
                    View viewN = this.mNextFocusGetter.n(root, view);
                    if (viewN != null && this.originalOrdinal.n(viewN)) {
                        this.nextFoci.aYN(view, viewN);
                        this.isConnectedTo.xMQ(viewN);
                    }
                    if (last == first) {
                        break;
                    } else {
                        last--;
                    }
                }
            }
            IntRange intRangeUntil2 = RangesKt.until(0, focusables._size);
            int first2 = intRangeUntil2.getFirst();
            int last2 = intRangeUntil2.getLast();
            if (first2 > last2) {
                return;
            }
            while (true) {
                View view2 = (View) focusables.nr(last2);
                if (((View) this.nextFoci.O(view2)) != null && !this.isConnectedTo.rl(view2)) {
                    nr(view2);
                }
                if (last2 == first2) {
                    return;
                } else {
                    last2--;
                }
            }
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }
    }

    private final View KN(View focused, ObjectList focusables, int count, boolean[] outLooped) {
        int i2;
        if (count < 2) {
            return null;
        }
        int iGh = focusables.gh(focused);
        if (iGh >= 0 && (i2 = iGh + 1) < count) {
            return (View) focusables.nr(i2);
        }
        outLooped[0] = true;
        return (View) focusables.nr(0);
    }

    private final boolean mUb(int id) {
        return (id == 0 || id == -1) ? false : true;
    }

    private final View xMQ(View focused, ObjectList focusables, int count, boolean[] outLooped) {
        int iJ2;
        if (count < 2) {
            return null;
        }
        if (focused != null && (iJ2 = focusables.J2(focused)) > 0) {
            return (View) focusables.nr(iJ2 - 1);
        }
        outLooped[0] = true;
        return (View) focusables.nr(count - 1);
    }

    private final View O(MutableObjectList focusables, ViewGroup root, View focused, int direction) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            Intrinsics.checkNotNull(root);
            userSpecifiedFocusComparator.t(focusables, root);
            Collections.sort(focusables.o(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.rl();
            int i2 = focusables.get_size();
            View viewXMQ = null;
            if (i2 < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (direction == 1) {
                viewXMQ = xMQ(focused, focusables, i2, zArr);
            } else if (direction == 2) {
                viewXMQ = KN(focused, focusables, i2, zArr);
            }
            return viewXMQ == null ? (View) focusables.nr(i2 - 1) : viewXMQ;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.rl();
            throw th;
        }
    }

    private final ViewGroup Uo(ViewGroup root, View focused) {
        if (focused != null && focused != root) {
            ViewParent parent = focused.getParent();
            ViewGroup viewGroup = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == root) {
                    if (viewGroup == null) {
                        break;
                    }
                    return viewGroup;
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                if (viewGroup2.getTouchscreenBlocksFocus() && focused.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup = viewGroup2;
                }
                parent = viewGroup2.getParent();
            }
        }
        return root;
    }

    private final View t(ViewGroup root, View focused, int direction, MutableObjectList focusables) {
        Rect rect = this.focusedRect;
        focused.getFocusedRect(rect);
        root.offsetDescendantRectToMyCoords(focused, rect);
        return O(focusables, root, focused, direction);
    }

    private final View J2(ViewGroup root, View focused, int direction) {
        View viewJ2 = FocusFinderCompat_androidKt.J2(focused, root, direction);
        boolean z2 = true;
        View viewJ22 = viewJ2;
        while (viewJ2 != null) {
            if (!viewJ2.isFocusable() || viewJ2.getVisibility() != 0 || (viewJ2.isInTouchMode() && !viewJ2.isFocusableInTouchMode())) {
                viewJ2 = FocusFinderCompat_androidKt.J2(viewJ2, root, direction);
                boolean z3 = !z2;
                if (!z2) {
                    if (viewJ22 != null) {
                        viewJ22 = FocusFinderCompat_androidKt.J2(viewJ22, root, direction);
                    } else {
                        viewJ22 = null;
                    }
                    if (viewJ22 == viewJ2) {
                        break;
                    }
                }
                z2 = z3;
            } else {
                return viewJ2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View gh(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.mUb(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.J2(view2, view, 2);
        }
        return null;
    }

    public final View nr(ViewGroup root, View focused, int direction) {
        ViewGroup viewGroupUo = Uo(root, focused);
        View viewJ2 = J2(viewGroupUo, focused, direction);
        if (viewJ2 != null) {
            return viewJ2;
        }
        MutableObjectList mutableObjectList = this.tmpList;
        try {
            mutableObjectList.Z();
            FocusFinderCompat_androidKt.nr(viewGroupUo, mutableObjectList, direction);
            if (!mutableObjectList.Uo()) {
                viewJ2 = t(viewGroupUo, focused, direction, mutableObjectList);
            }
            return viewJ2;
        } finally {
            mutableObjectList.Z();
        }
    }
}
