package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.safedk.android.utils.SdksMapping;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final FragmentManager f38557n;

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        final FragmentStateManager fragmentStateManagerIF;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f38557n);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f38465n);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(R.styleable.rl);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.f38466t, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.nr);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !FragmentFactory.rl(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentXg = resourceId != -1 ? this.f38557n.xg(resourceId) : null;
        if (fragmentXg == null && string != null) {
            fragmentXg = this.f38557n.pJg(string);
        }
        if (fragmentXg == null && id != -1) {
            fragmentXg = this.f38557n.xg(id);
        }
        if (fragmentXg == null) {
            fragmentXg = this.f38557n.HV().n(context.getClassLoader(), attributeValue);
            fragmentXg.mFromLayout = true;
            fragmentXg.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentXg.mContainerId = id;
            fragmentXg.mTag = string;
            fragmentXg.mInLayout = true;
            FragmentManager fragmentManager = this.f38557n;
            fragmentXg.mFragmentManager = fragmentManager;
            fragmentXg.mHost = fragmentManager.EWS();
            fragmentXg.onInflate(this.f38557n.EWS().getContext(), attributeSet, fragmentXg.mSavedFragmentState);
            fragmentStateManagerIF = this.f38557n.qie(fragmentXg);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentXg + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentXg.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentXg.mInLayout = true;
            FragmentManager fragmentManager2 = this.f38557n;
            fragmentXg.mFragmentManager = fragmentManager2;
            fragmentXg.mHost = fragmentManager2.EWS();
            fragmentXg.onInflate(this.f38557n.EWS().getContext(), attributeSet, fragmentXg.mSavedFragmentState);
            fragmentStateManagerIF = this.f38557n.iF(fragmentXg);
            if (FragmentManager.F(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentXg + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.xMQ(fragmentXg, viewGroup);
        fragmentXg.mContainer = viewGroup;
        fragmentStateManagerIF.az();
        fragmentStateManagerIF.mUb();
        View view2 = fragmentXg.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentXg.mView.getTag() == null) {
            fragmentXg.mView.setTag(string);
        }
        fragmentXg.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view3) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view3) {
                Fragment fragmentGh = fragmentStateManagerIF.gh();
                fragmentStateManagerIF.az();
                SpecialEffectsController.XQ((ViewGroup) fragmentGh.mView.getParent(), FragmentLayoutInflaterFactory.this.f38557n).Ik();
            }
        });
        return fragmentXg.mView;
    }

    FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.f38557n = fragmentManager;
    }
}
