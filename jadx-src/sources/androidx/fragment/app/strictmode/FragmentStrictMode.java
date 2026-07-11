package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003<=>B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "t", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "previousFragmentId", "", "KN", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "xMQ", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "Ik", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "az", "(Landroidx/fragment/app/Fragment;)V", "mUb", "", "isVisibleToUser", "HI", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", "requestCode", "ty", "qie", "gh", "ck", "Landroidx/fragment/app/strictmode/Violation;", "violation", "Uo", "(Landroidx/fragment/app/strictmode/Violation;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "o", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;Ljava/lang/Class;Ljava/lang/Class;)Z", "nr", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;Landroidx/fragment/app/strictmode/Violation;)V", "Ljava/lang/Runnable;", "runnable", "r", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "rl", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "defaultPolicy", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FragmentStrictMode f38750n = new FragmentStrictMode();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static Policy defaultPolicy = Policy.f38759O;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "o", "Z", "S", "g", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "Landroidx/fragment/app/strictmode/Violation;", "violation", "", c.f62177j, "(Landroidx/fragment/app/strictmode/Violation;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnViolationListener {
        void n(Violation violation);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R4\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "flags", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", c.f62177j, "Ljava/util/Set;", "()Ljava/util/Set;", "rl", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "t", "Ljava/util/Map;", "()Ljava/util/Map;", "mAllowedViolations", "nr", "Builder", "Companion", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Policy {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Set flags;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final OnViolationListener listener;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Map mAllowedViolations;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Policy f38759O = new Policy(SetsKt.emptySet(), null, MapsKt.emptyMap());

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
        }

        public Policy(Set flags, OnViolationListener onViolationListener, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Set getFlags() {
            return this.flags;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final OnViolationListener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Map getMAllowedViolations() {
            return this.mAllowedViolations;
        }
    }

    private final void Uo(Violation violation) {
        if (FragmentManager.F(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    public static final void HI(Fragment fragment, boolean isVisibleToUser) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, isVisibleToUser);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(setUserVisibleHintViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.o(policyT, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.nr(policyT, setUserVisibleHintViolation);
        }
    }

    public static final void Ik(Fragment fragment, Fragment expectedParentFragment, int containerId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, containerId);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(wrongNestedHierarchyViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.o(policyT, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.nr(policyT, wrongNestedHierarchyViolation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(String str, Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void KN(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(fragmentReuseViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.o(policyT, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.nr(policyT, fragmentReuseViolation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Policy policy, Violation violation) {
        Intrinsics.checkNotNullParameter(policy, "$policy");
        Intrinsics.checkNotNullParameter(violation, "$violation");
        policy.getListener().n(violation);
    }

    public static final void az(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(setRetainInstanceUsageViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.o(policyT, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, setRetainInstanceUsageViolation);
        }
    }

    public static final void ck(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(wrongFragmentContainerViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.o(policyT, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.nr(policyT, wrongFragmentContainerViolation);
        }
    }

    public static final void gh(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(getTargetFragmentRequestCodeUsageViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.o(policyT, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void mUb(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(getRetainInstanceUsageViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.o(policyT, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, getRetainInstanceUsageViolation);
        }
    }

    public static final void qie(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(getTargetFragmentUsageViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.o(policyT, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, getTargetFragmentUsageViolation);
        }
    }

    private final Policy t(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.tUK() != null) {
                    Policy policyTUK = parentFragmentManager.tUK();
                    Intrinsics.checkNotNull(policyTUK);
                    return policyTUK;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    public static final void ty(Fragment violatingFragment, Fragment targetFragment, int requestCode) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, requestCode);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(setTargetFragmentUsageViolation);
        Policy policyT = fragmentStrictMode.t(violatingFragment);
        if (policyT.getFlags().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.o(policyT, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, setTargetFragmentUsageViolation);
        }
    }

    public static final void xMQ(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = f38750n;
        fragmentStrictMode.Uo(fragmentTagUsageViolation);
        Policy policyT = fragmentStrictMode.t(fragment);
        if (policyT.getFlags().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.o(policyT, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.nr(policyT, fragmentTagUsageViolation);
        }
    }

    private FragmentStrictMode() {
    }

    private final void nr(final Policy policy, final Violation violation) {
        Fragment fragmentN = violation.getFragment();
        final String name = fragmentN.getClass().getName();
        if (policy.getFlags().contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        if (policy.getListener() != null) {
            r(fragmentN, new Runnable() { // from class: J.j
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.O(policy, violation);
                }
            });
        }
        if (policy.getFlags().contains(Flag.PENALTY_DEATH)) {
            r(fragmentN, new Runnable() { // from class: J.n
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.J2(name, violation);
                }
            });
        }
    }

    private final boolean o(Policy policy, Class fragmentClass, Class violationClass) {
        Set set = (Set) policy.getMAllowedViolations().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (!Intrinsics.areEqual(violationClass.getSuperclass(), Violation.class) && CollectionsKt.contains(set, violationClass.getSuperclass())) {
            return false;
        }
        return !set.contains(violationClass);
    }

    private final void r(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handlerKN = fragment.getParentFragmentManager().EWS().getHandler();
            if (Intrinsics.areEqual(handlerKN.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                handlerKN.post(runnable);
                return;
            }
        }
        runnable.run();
    }
}
