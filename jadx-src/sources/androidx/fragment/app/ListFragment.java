package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ListFragment extends Fragment {
    CharSequence E2;
    ListAdapter J2;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    View f38696S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    TextView f38697Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f38698e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f38699g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f38701o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ListView f38702r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f38700n = new Handler();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f38703t = new Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f38702r;
            listView.focusableViewAvailable(listView);
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f38695O = new AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            ListFragment.this.aYN((ListView) adapterView, view, i2, j2);
        }
    };

    public void aYN(ListView listView, View view, int i2, long j2) {
    }

    private void WPU() {
        if (this.f38702r != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f38702r = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.f38697Z = textView;
            if (textView == null) {
                this.f38701o = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f38696S = view.findViewById(16711682);
            this.f38699g = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f38702r = listView;
            View view2 = this.f38701o;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.E2;
                if (charSequence != null) {
                    this.f38697Z.setText(charSequence);
                    this.f38702r.setEmptyView(this.f38697Z);
                }
            }
        }
        this.f38698e = true;
        this.f38702r.setOnItemClickListener(this.f38695O);
        ListAdapter listAdapter = this.J2;
        if (listAdapter != null) {
            this.J2 = null;
            ViF(listAdapter);
        } else if (this.f38696S != null) {
            nY(false, false);
        }
        this.f38700n.post(this.f38703t);
    }

    public void ViF(ListAdapter listAdapter) {
        boolean z2 = this.J2 != null;
        this.J2 = listAdapter;
        ListView listView = this.f38702r;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f38698e || z2) {
                return;
            }
            nY(true, requireView().getWindowToken() != null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f38700n.removeCallbacks(this.f38703t);
        this.f38702r = null;
        this.f38698e = false;
        this.f38699g = null;
        this.f38696S = null;
        this.f38701o = null;
        this.f38697Z = null;
        super.onDestroyView();
    }

    private void nY(boolean z2, boolean z3) {
        WPU();
        View view = this.f38696S;
        if (view != null) {
            if (this.f38698e == z2) {
                return;
            }
            this.f38698e = z2;
            if (z2) {
                if (z3) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                    this.f38699g.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                } else {
                    view.clearAnimation();
                    this.f38699g.clearAnimation();
                }
                this.f38696S.setVisibility(8);
                this.f38699g.setVisibility(0);
                return;
            }
            if (z3) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                this.f38699g.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
            } else {
                view.clearAnimation();
                this.f38699g.clearAnimation();
            }
            this.f38696S.setVisibility(0);
            this.f38699g.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WPU();
    }
}
