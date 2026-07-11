package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Tracks {
    public static final Tracks EMPTY = new Tracks(com.google.common.collect.nKK.r());
    private static final String FIELD_TRACK_GROUPS = Util.intToStringMaxRadix(0);
    private final com.google.common.collect.nKK groups;

    public static final class Group {
        private final boolean adaptiveSupported;
        public final int length;
        private final TrackGroup mediaTrackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private static final String FIELD_TRACK_GROUP = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACK_SUPPORT = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_SELECTED = Util.intToStringMaxRadix(3);
        private static final String FIELD_ADAPTIVE_SUPPORTED = Util.intToStringMaxRadix(4);

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

        @UnstableApi
        public static Group fromBundle(Bundle bundle) {
            TrackGroup trackGroupFromBundle = TrackGroup.fromBundle((Bundle) Assertions.checkNotNull(bundle.getBundle(FIELD_TRACK_GROUP)));
            return new Group(trackGroupFromBundle, bundle.getBoolean(FIELD_ADAPTIVE_SUPPORTED, false), (int[]) t1.Dsr.n(bundle.getIntArray(FIELD_TRACK_SUPPORT), new int[trackGroupFromBundle.length]), (boolean[]) t1.Dsr.n(bundle.getBooleanArray(FIELD_TRACK_SELECTED), new boolean[trackGroupFromBundle.length]));
        }

        @UnstableApi
        public Group copyWithId(String str) {
            return new Group(this.mediaTrackGroup.copyWithId(str), this.adaptiveSupported, this.trackSupport, this.trackSelected);
        }

        public TrackGroup getMediaTrackGroup() {
            return this.mediaTrackGroup;
        }

        public Format getTrackFormat(int i2) {
            return this.mediaTrackGroup.getFormat(i2);
        }

        @UnstableApi
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

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(FIELD_TRACK_GROUP, this.mediaTrackGroup.toBundle());
            bundle.putIntArray(FIELD_TRACK_SUPPORT, this.trackSupport);
            bundle.putBooleanArray(FIELD_TRACK_SELECTED, this.trackSelected);
            bundle.putBoolean(FIELD_ADAPTIVE_SUPPORTED, this.adaptiveSupported);
            return bundle;
        }

        @UnstableApi
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

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2) {
        return isTypeSupportedOrEmpty(i2, false);
    }

    @UnstableApi
    public static Tracks fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_TRACK_GROUPS);
        return new Tracks(parcelableArrayList == null ? com.google.common.collect.nKK.r() : BundleCollectionUtil.fromBundleList(new t1.CN3() { // from class: androidx.media3.common.U4
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return Tracks.Group.fromBundle((Bundle) obj);
            }
        }, parcelableArrayList));
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

    @UnstableApi
    @Deprecated
    public boolean isTypeSupportedOrEmpty(int i2, boolean z2) {
        return !containsType(i2) || isTypeSupported(i2, z2);
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_TRACK_GROUPS, BundleCollectionUtil.toBundleArrayList(this.groups, new t1.CN3() { // from class: androidx.media3.common.oXP
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return ((Tracks.Group) obj).toBundle();
            }
        }));
        return bundle;
    }

    @UnstableApi
    public Tracks(List<Group> list) {
        this.groups = com.google.common.collect.nKK.ty(list);
    }
}
