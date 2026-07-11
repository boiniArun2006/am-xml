package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Tracks implements Bundleable {
    private static final int FIELD_TRACK_GROUPS = 0;
    private final com.google.common.collect.nKK groups;
    public static final Tracks EMPTY = new Tracks(com.google.common.collect.nKK.r());
    public static final Bundleable.Creator<Tracks> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.IG
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Tracks.n(bundle);
        }
    };

    public static final class Group implements Bundleable {
        public static final Bundleable.Creator<Group> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.FPL
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Tracks.Group.n(bundle);
            }
        };
        private static final int FIELD_ADAPTIVE_SUPPORTED = 4;
        private static final int FIELD_TRACK_GROUP = 0;
        private static final int FIELD_TRACK_SELECTED = 3;
        private static final int FIELD_TRACK_SUPPORT = 1;
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isSupported() {
            return isSupported(false);
        }

        public boolean isTrackSupported(int i2) {
            return isTrackSupported(i2, false);
        }

        private static String keyForField(int i2) {
            return Integer.toString(i2, 36);
        }

        public static /* synthetic */ Group n(Bundle bundle) {
            TrackGroup trackGroup = (TrackGroup) TrackGroup.CREATOR.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(keyForField(0))));
            return new Group(trackGroup, bundle.getBoolean(keyForField(4), false), (int[]) t1.Dsr.n(bundle.getIntArray(keyForField(1)), new int[trackGroup.length]), (boolean[]) t1.Dsr.n(bundle.getBooleanArray(keyForField(3)), new boolean[trackGroup.length]));
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i2) {
            return this.mediaTrackGroup.getFormat(i2);
        }

        public int getTrackSupport(int i2) {
            return this.trackSupport[i2];
        }

        public int getType() {
            return this.mediaTrackGroup.type;
        }

        public int hashCode() {
            return (((((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31) + Arrays.hashCode(this.trackSupport)) * 31) + Arrays.hashCode(this.trackSelected);
        }

        public boolean isAdaptiveSupported() {
            return this.adaptiveSupported;
        }

        public boolean isSelected() {
            return com.google.common.primitives.j.n(this.trackSelected, true);
        }

        public boolean isSupported(boolean z2) {
            for (int i2 = 0; i2 < this.trackSupport.length; i2++) {
                if (isTrackSupported(i2, z2)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i2) {
            return this.trackSelected[i2];
        }

        public boolean isTrackSupported(int i2, boolean z2) {
            int i3 = this.trackSupport[i2];
            if (i3 != 4) {
                return z2 && i3 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(keyForField(0), this.mediaTrackGroup.toBundle());
            bundle.putIntArray(keyForField(1), this.trackSupport);
            bundle.putBooleanArray(keyForField(3), this.trackSelected);
            bundle.putBoolean(keyForField(4), this.adaptiveSupported);
            return bundle;
        }

        public Group(TrackGroup trackGroup, boolean z2, int[] iArr, boolean[] zArr) {
            boolean z3;
            int i2 = trackGroup.length;
            this.length = i2;
            boolean z4 = false;
            if (i2 == iArr.length && i2 == zArr.length) {
                z3 = true;
            } else {
                z3 = false;
            }
            Assertions.checkArgument(z3);
            this.mediaTrackGroup = trackGroup;
            if (z2 && i2 > 1) {
                z4 = true;
            }
            this.adaptiveSupported = z4;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }
    }

    public static /* synthetic */ Tracks n(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(0));
        return new Tracks(parcelableArrayList == null ? com.google.common.collect.nKK.r() : BundleableUtil.fromBundleList(Group.CREATOR, parcelableArrayList));
    }

    public boolean containsType(int i2) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            if (((Group) this.groups.get(i3)).getType() == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSelected(int i2) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            Group group = (Group) this.groups.get(i3);
            if (group.isSelected() && group.getType() == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupported(int i2) {
        return isTypeSupported(i2, false);
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2) {
        return isTypeSupportedOrEmpty(i2, false);
    }

    private static String keyForField(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        return this.groups.equals(((Tracks) obj).groups);
    }

    public com.google.common.collect.nKK getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    public boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public boolean isTypeSupported(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.groups.size(); i3++) {
            if (((Group) this.groups.get(i3)).getType() == i2 && ((Group) this.groups.get(i3)).isSupported(z2)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2, boolean z2) {
        return !containsType(i2) || isTypeSupported(i2, z2);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(this.groups));
        return bundle;
    }

    public Tracks(List<Group> list) {
        this.groups = com.google.common.collect.nKK.ty(list);
    }
}
