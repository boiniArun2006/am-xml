package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.e5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f51123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecyclerView.Adapter f51124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f51125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f51126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e5 f51127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f51128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f51130h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f51132a;

        public ViewGroup getContainerView() {
            return this.f51132a;
        }

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f51132a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }
    }

    class a implements e5.a {
        a() {
        }

        @Override // com.applovin.impl.e5.a
        public void a(int i2, int i3) {
            MaxRecyclerAdapter.this.f51123a.updateFillablePositions(i2, Math.min(i3 + MaxRecyclerAdapter.this.f51129g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    private class b extends RecyclerView.AdapterDataObserver {
        private b() {
        }

        /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            int adjustedPosition = MaxRecyclerAdapter.this.f51123a.getAdjustedPosition(i2);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f51123a.getAdjustedPosition((i2 + i3) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            boolean z2 = i2 + i3 >= MaxRecyclerAdapter.this.f51124b.getItemCount();
            if (MaxRecyclerAdapter.this.f51130h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f51130h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f51123a.getAdjustedPosition(i2);
            for (int i5 = 0; i5 < i3; i5++) {
                MaxRecyclerAdapter.this.f51123a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i5) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            int itemCount = MaxRecyclerAdapter.this.f51124b.getItemCount();
            boolean z2 = i2 + i3 >= itemCount;
            if (MaxRecyclerAdapter.this.f51130h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f51130h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f51123a.getAdjustedPosition(i2);
            int adjustedCount = MaxRecyclerAdapter.this.f51123a.getAdjustedCount(itemCount + i3);
            for (int i5 = 0; i5 < i3; i5++) {
                MaxRecyclerAdapter.this.f51123a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f51123a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f51123a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i3), size);
        }
    }

    public void destroy() {
        try {
            this.f51124b.unregisterAdapterDataObserver(this.f51125c);
        } catch (Exception unused) {
        }
        this.f51123a.destroy();
        e5 e5Var = this.f51127e;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f51123a;
    }

    public int getAdjustedPosition(int i2) {
        return this.f51123a.getAdjustedPosition(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f51123a.getAdjustedCount(this.f51124b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        if (this.f51124b.hasStableIds()) {
            return this.f51123a.isFilledPosition(i2) ? this.f51123a.getAdItemId(i2) : this.f51124b.getItemId(this.f51123a.getOriginalPosition(i2));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (this.f51123a.isAdPosition(i2)) {
            return -42;
        }
        return this.f51124b.getItemViewType(this.f51123a.getOriginalPosition(i2));
    }

    public int getOriginalPosition(int i2) {
        return this.f51123a.getOriginalPosition(i2);
    }

    public void loadAds() {
        this.f51123a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f51128f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i2) {
        MaxAdPlacer.Listener listener = this.f51128f;
        if (listener != null) {
            listener.onAdRemoved(i2);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f51128f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
        this.f51127e.a(viewHolder.itemView, i2);
        if (!this.f51123a.isAdPosition(i2)) {
            this.f51124b.onBindViewHolder(viewHolder, this.f51123a.getOriginalPosition(i2));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f51123a.getAdSize(i2);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f51123a.renderAd(i2, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        if (i2 != -42) {
            return this.f51124b.onCreateViewHolder(viewGroup, i2);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f51126d.getLayoutManager();
        if (layoutManager == null || !layoutManager.ViF()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f51124b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f51124b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f51124b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        e5 e5Var = this.f51127e;
        if (e5Var != null) {
            e5Var.b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof MaxAdRecyclerViewHolder)) {
            this.f51124b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f51123a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f51130h = adPositionBehavior;
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f51128f = listener;
    }

    public void setLookAhead(int i2) {
        this.f51129g = i2;
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        b bVar = new b(this, null);
        this.f51125c = bVar;
        this.f51129g = 8;
        this.f51130h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f51123a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f51124b = adapter;
        adapter.registerAdapterDataObserver(bVar);
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i2) {
        notifyItemChanged(i2);
        MaxAdPlacer.Listener listener = this.f51128f;
        if (listener != null) {
            listener.onAdLoaded(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f51126d = recyclerView;
        e5 e5Var = new e5(recyclerView);
        this.f51127e = e5Var;
        e5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f51126d = null;
        e5 e5Var = this.f51127e;
        if (e5Var != null) {
            e5Var.a();
            this.f51127e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z2) {
        super.setHasStableIds(z2);
        this.f51124b.unregisterAdapterDataObserver(this.f51125c);
        this.f51124b.setHasStableIds(z2);
        this.f51124b.registerAdapterDataObserver(this.f51125c);
    }
}
