package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.iF;
import com.google.common.collect.l3D;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";

    @GuardedBy
    private AudioAttributes audioAttributes;

    @Nullable
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;

    @GuardedBy
    private Parameters parameters;

    @Nullable
    @GuardedBy
    private Ml spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;
    private static final iF FORMAT_VALUE_ORDERING = iF.rl(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.n
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.nr((Integer) obj, (Integer) obj2);
        }
    });
    private static final iF NO_ORDER = iF.rl(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.w6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    static final class I28 extends TrackInfo implements Comparable {
        private final int E2;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private final boolean f58375S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final boolean f58376T;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final int f58377X;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final boolean f58378Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f58379e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f58380g;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f58381o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f58382r;

        public static int t(List list, List list2) {
            return ((I28) list.get(0)).compareTo((I28) list2.get(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public boolean rl(I28 i28) {
            return false;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int n() {
            return this.f58382r;
        }

        public I28(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i5, String str) {
            boolean z2;
            boolean z3;
            nKK nkkO;
            int formatLanguageScore;
            boolean z4;
            boolean z5;
            boolean z6;
            super(i2, trackGroup, i3);
            int i7 = 0;
            this.f58381o = DefaultTrackSelector.isSupported(i5, false);
            int i8 = this.J2.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            if ((i8 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f58378Z = z2;
            if ((i8 & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f58375S = z3;
            if (parameters.preferredTextLanguages.isEmpty()) {
                nkkO = nKK.o("");
            } else {
                nkkO = parameters.preferredTextLanguages;
            }
            int i9 = 0;
            while (true) {
                if (i9 < nkkO.size()) {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.J2, (String) nkkO.get(i9), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    i9 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                }
            }
            this.f58380g = i9;
            this.E2 = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.J2.roleFlags, parameters.preferredTextRoleFlags);
            this.f58379e = roleFlagMatchScore;
            if ((this.J2.roleFlags & 1088) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f58376T = z4;
            if (DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.J2, str, z5);
            this.f58377X = formatLanguageScore2;
            if (formatLanguageScore <= 0 && ((!parameters.preferredTextLanguages.isEmpty() || roleFlagMatchScore <= 0) && !this.f58378Z && (!this.f58375S || formatLanguageScore2 <= 0))) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (DefaultTrackSelector.isSupported(i5, parameters.exceedRendererCapabilitiesIfNecessary) && z6) {
                i7 = 1;
            }
            this.f58382r = i7;
        }

        public static nKK J2(int i2, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str) {
            nKK.j jVarGh = nKK.gh();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                jVarGh.n(new I28(i2, trackGroup, i3, parameters, iArr[i3], str));
            }
            return jVarGh.gh();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public int compareTo(I28 i28) {
            iF iFVarO;
            l3D l3dUo = l3D.mUb().Uo(this.f58381o, i28.f58381o).J2(Integer.valueOf(this.f58380g), Integer.valueOf(i28.f58380g), iF.t().O()).nr(this.E2, i28.E2).nr(this.f58379e, i28.f58379e).Uo(this.f58378Z, i28.f58378Z);
            Boolean boolValueOf = Boolean.valueOf(this.f58375S);
            Boolean boolValueOf2 = Boolean.valueOf(i28.f58375S);
            if (this.E2 == 0) {
                iFVarO = iF.t();
            } else {
                iFVarO = iF.t().O();
            }
            l3D l3dNr = l3dUo.J2(boolValueOf, boolValueOf2, iFVarO).nr(this.f58377X, i28.f58377X);
            if (this.f58379e == 0) {
                l3dNr = l3dNr.KN(this.f58376T, i28.f58376T);
            }
            return l3dNr.xMQ();
        }
    }

    private static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Spatializer f58383n;
        private Spatializer$OnSpatializerStateChangedListener nr;
        private final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Handler f58384t;

        class j implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ DefaultTrackSelector f58385n;

            j(Ml ml, DefaultTrackSelector defaultTrackSelector) {
                this.f58385n = defaultTrackSelector;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
                this.f58385n.maybeInvalidateForAudioChannelCountConstraints();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
                this.f58385n.maybeInvalidateForAudioChannelCountConstraints();
            }
        }

        public static Ml Uo(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new Ml(audioManager.getSpatializer());
        }

        public void J2() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.nr;
            if (spatializer$OnSpatializerStateChangedListener == null || this.f58384t == null) {
                return;
            }
            this.f58383n.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) Util.castNonNull(this.f58384t)).removeCallbacksAndMessages(null);
            this.f58384t = null;
            this.nr = null;
        }

        public boolean O() {
            return this.rl;
        }

        public boolean n(AudioAttributes audioAttributes, Format format) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.getAudioTrackChannelConfig(("audio/eac3-joc".equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount));
            int i2 = format.sampleRate;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f58383n.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public boolean nr() {
            return this.f58383n.isEnabled();
        }

        public void rl(DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.nr == null && this.f58384t == null) {
                this.nr = new j(this, defaultTrackSelector);
                Handler handler = new Handler(looper);
                this.f58384t = handler;
                Spatializer spatializer = this.f58383n;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new androidx.media3.common.util.Wre(handler), this.nr);
            }
        }

        public boolean t() {
            return this.f58383n.isAvailable();
        }

        private Ml(Spatializer spatializer) {
            boolean z2;
            this.f58383n = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.rl = z2;
        }
    }

    public static final class Parameters extends TrackSelectionParameters implements Bundleable {
        public static final Bundleable.Creator<Parameters> CREATOR;

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final int FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = 1006;
        private static final int FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1015;
        private static final int FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = 1004;
        private static final int FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = 1005;
        private static final int FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = 1009;
        private static final int FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1014;
        private static final int FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = 1001;
        private static final int FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = 1002;
        private static final int FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = 1016;
        private static final int FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NCESSARY = 1003;
        private static final int FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = 1007;
        private static final int FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = 1000;
        private static final int FIELD_RENDERER_DISABLED_INDICES = 1013;
        private static final int FIELD_SELECTION_OVERRIDES = 1012;
        private static final int FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = 1010;
        private static final int FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = 1011;
        private static final int FIELD_TUNNELING_ENABLED = 1008;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
            }

            @Deprecated
            public Builder clearSelectionOverrides(int i2) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i2);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i2);
                }
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
                }
                return sparseArray2;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i2 : iArr) {
                    sparseBooleanArray.append(i2, true);
                }
                return sparseBooleanArray;
            }

            private void setSelectionOverridesFromBundle(Bundle bundle) {
                int[] intArray = bundle.getIntArray(TrackSelectionParameters.keyForField(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(TrackSelectionParameters.keyForField(1011));
                nKK nkkR = parcelableArrayList == null ? nKK.r() : BundleableUtil.fromBundleList(TrackGroupArray.CREATOR, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(TrackSelectionParameters.keyForField(1012));
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : BundleableUtil.fromBundleSparseArray(SelectionOverride.CREATOR, sparseParcelableArray);
                if (intArray == null || intArray.length != nkkR.size()) {
                    return;
                }
                for (int i2 = 0; i2 < intArray.length; i2++) {
                    setSelectionOverride(intArray[i2], (TrackGroupArray) nkkR.get(i2), (SelectionOverride) sparseArray.get(i2));
                }
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Parameters build() {
                return new Parameters(this);
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearOverridesOfType(int i2) {
                super.clearOverridesOfType(i2);
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverride(int i2, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i2);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i2);
                    }
                }
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z2) {
                this.allowAudioMixedChannelCountAdaptiveness = z2;
                return this;
            }

            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z2) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z2;
                return this;
            }

            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z2) {
                this.allowAudioMixedMimeTypeAdaptiveness = z2;
                return this;
            }

            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z2) {
                this.allowAudioMixedSampleRateAdaptiveness = z2;
                return this;
            }

            public Builder setAllowMultipleAdaptiveSelections(boolean z2) {
                this.allowMultipleAdaptiveSelections = z2;
                return this;
            }

            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z2) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z2;
                return this;
            }

            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z2) {
                this.allowVideoMixedMimeTypeAdaptiveness = z2;
                return this;
            }

            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z2) {
                this.allowVideoNonSeamlessAdaptiveness = z2;
                return this;
            }

            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z2) {
                this.constrainAudioChannelCountToDeviceCapabilities = z2;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            public Builder setExceedAudioConstraintsIfNecessary(boolean z2) {
                this.exceedAudioConstraintsIfNecessary = z2;
                return this;
            }

            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z2) {
                this.exceedRendererCapabilitiesIfNecessary = z2;
                return this;
            }

            public Builder setExceedVideoConstraintsIfNecessary(boolean z2) {
                this.exceedVideoConstraintsIfNecessary = z2;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setForceHighestSupportedBitrate(boolean z2) {
                super.setForceHighestSupportedBitrate(z2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setForceLowestBitrate(boolean z2) {
                super.setForceLowestBitrate(z2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setIgnoredTextSelectionFlags(int i2) {
                super.setIgnoredTextSelectionFlags(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxAudioBitrate(int i2) {
                super.setMaxAudioBitrate(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxAudioChannelCount(int i2) {
                super.setMaxAudioChannelCount(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoBitrate(int i2) {
                super.setMaxVideoBitrate(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoFrameRate(int i2) {
                super.setMaxVideoFrameRate(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoSize(int i2, int i3) {
                super.setMaxVideoSize(i2, i3);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoBitrate(int i2) {
                super.setMinVideoBitrate(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoFrameRate(int i2) {
                super.setMinVideoFrameRate(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setMinVideoSize(int i2, int i3) {
                super.setMinVideoSize(i2, i3);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguage(@Nullable String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeType(@Nullable String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredAudioRoleFlags(int i2) {
                super.setPreferredAudioRoleFlags(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguage(@Nullable String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredTextRoleFlags(int i2) {
                super.setPreferredTextRoleFlags(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeType(@Nullable String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setPreferredVideoRoleFlags(int i2) {
                super.setPreferredVideoRoleFlags(i2);
                return this;
            }

            public Builder setRendererDisabled(int i2, boolean z2) {
                if (this.rendererDisabledFlags.get(i2) == z2) {
                    return this;
                }
                if (z2) {
                    this.rendererDisabledFlags.put(i2, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setSelectUndeterminedTextLanguage(boolean z2) {
                super.setSelectUndeterminedTextLanguage(z2);
                return this;
            }

            @Deprecated
            public Builder setSelectionOverride(int i2, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i2);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i2, map);
                }
                if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setTrackTypeDisabled(int i2, boolean z2) {
                super.setTrackTypeDisabled(i2, z2);
                return this;
            }

            public Builder setTunnelingEnabled(boolean z2) {
                this.tunnelingEnabled = z2;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setViewportSize(int i2, int i3, boolean z2) {
                super.setViewportSize(i2, i3, z2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z2) {
                super.setViewportSizeToPhysicalDisplaySize(context, z2);
                return this;
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i2) {
                return setIgnoredTextSelectionFlags(i2);
            }

            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(TrackSelectionParameters.keyForField(1000), parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1001), parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1002), parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1014), parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(TrackSelectionParameters.keyForField(1003), parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1004), parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1005), parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1006), parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(TrackSelectionParameters.keyForField(1015), parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(TrackSelectionParameters.keyForField(1016), parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(TrackSelectionParameters.keyForField(1007), parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(TrackSelectionParameters.keyForField(1008), parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(TrackSelectionParameters.keyForField(1009), parameters.allowMultipleAdaptiveSelections));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(TrackSelectionParameters.keyForField(1013)));
            }
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        static {
            Parameters parametersBuild = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.C
                @Override // com.google.android.exoplayer2.Bundleable.Creator
                public final Bundleable fromBundle(Bundle bundle) {
                    return new DefaultTrackSelector.Parameters.Builder(bundle).build();
                }
            };
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i2).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(TrackSelectionParameters.keyForField(1010), com.google.common.primitives.Wre.az(arrayList));
                bundle.putParcelableArrayList(TrackSelectionParameters.keyForField(1011), BundleableUtil.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(TrackSelectionParameters.keyForField(1012), BundleableUtil.toBundleSparseArray(sparseArray2));
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public Builder buildUpon() {
            return new Builder();
        }

        public boolean getRendererDisabled(int i2) {
            return this.rendererDisabledFlags.get(i2);
        }

        @Nullable
        @Deprecated
        public SelectionOverride getSelectionOverride(int i2, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i2);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i2, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i2);
            return map != null && map.containsKey(trackGroupArray);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                iArr[i2] = sparseBooleanArray.keyAt(i2);
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(TrackSelectionParameters.keyForField(1000), this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1001), this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1002), this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1014), this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1003), this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1004), this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1005), this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1006), this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1015), this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1016), this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1007), this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1008), this.tunnelingEnabled);
            bundle.putBoolean(TrackSelectionParameters.keyForField(1009), this.allowMultipleAdaptiveSelections);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(TrackSelectionParameters.keyForField(1013), getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i2) {
            this.delegate.clearSelectionOverrides(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
            return this.delegate.build();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearOverridesOfType(int i2) {
            this.delegate.clearOverridesOfType(i2);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i2, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i2, trackGroupArray);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z2) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z2) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z2) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z2) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z2) {
            this.delegate.setAllowMultipleAdaptiveSelections(z2);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z2) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z2) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z2);
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z2) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z2);
            return this;
        }

        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i2) {
            this.delegate.setDisabledTextTrackSelectionFlags(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z2) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z2);
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z2) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z2);
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z2) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z2) {
            this.delegate.setForceHighestSupportedBitrate(z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean z2) {
            this.delegate.setForceLowestBitrate(z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setIgnoredTextSelectionFlags(int i2) {
            this.delegate.setIgnoredTextSelectionFlags(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int i2) {
            this.delegate.setMaxAudioBitrate(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int i2) {
            this.delegate.setMaxAudioChannelCount(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int i2) {
            this.delegate.setMaxVideoBitrate(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int i2) {
            this.delegate.setMaxVideoFrameRate(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int i2, int i3) {
            this.delegate.setMaxVideoSize(i2, i3);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int i2) {
            this.delegate.setMinVideoBitrate(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int i2) {
            this.delegate.setMinVideoFrameRate(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int i2, int i3) {
            this.delegate.setMinVideoSize(i2, i3);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(@Nullable String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(@Nullable String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int i2) {
            this.delegate.setPreferredAudioRoleFlags(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(@Nullable String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int i2) {
            this.delegate.setPreferredTextRoleFlags(i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(@Nullable String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoRoleFlags(int i2) {
            this.delegate.setPreferredVideoRoleFlags(i2);
            return this;
        }

        public ParametersBuilder setRendererDisabled(int i2, boolean z2) {
            this.delegate.setRendererDisabled(i2, z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z2) {
            this.delegate.setSelectUndeterminedTextLanguage(z2);
            return this;
        }

        @Deprecated
        public ParametersBuilder setSelectionOverride(int i2, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i2, trackGroupArray, selectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setTrackTypeDisabled(int i2, boolean z2) {
            this.delegate.setTrackTypeDisabled(i2, z2);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z2) {
            this.delegate.setTunnelingEnabled(z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int i2, int i3, boolean z2) {
            this.delegate.setViewportSize(i2, i3, z2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z2) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z2);
            return this;
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }
    }

    public static final class SelectionOverride implements Bundleable {
        public static final Bundleable.Creator<SelectionOverride> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.o
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return DefaultTrackSelector.SelectionOverride.n(bundle);
            }
        };
        private static final int FIELD_GROUP_INDEX = 0;
        private static final int FIELD_TRACKS = 1;
        private static final int FIELD_TRACK_TYPE = 2;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i2, int... iArr) {
            this(i2, iArr, 0);
        }

        public static /* synthetic */ SelectionOverride n(Bundle bundle) {
            boolean z2 = false;
            int i2 = bundle.getInt(keyForField(0), -1);
            int[] intArray = bundle.getIntArray(keyForField(1));
            int i3 = bundle.getInt(keyForField(2), -1);
            if (i2 >= 0 && i3 >= 0) {
                z2 = true;
            }
            Assertions.checkArgument(z2);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i2, intArray, i3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public SelectionOverride(int i2, int[] iArr, int i3) {
            this.groupIndex = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i3;
            Arrays.sort(iArrCopyOf);
        }

        private static String keyForField(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean containsTrack(int i2) {
            for (int i3 : this.tracks) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(keyForField(0), this.groupIndex);
            bundle.putIntArray(keyForField(1), this.tracks);
            bundle.putInt(keyForField(2), this.type);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class Wre extends TrackInfo {
        private final int E2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private final boolean f58389N;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private final boolean f58390S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final boolean f58391T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private final int f58392U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final int f58393X;
        private final boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final boolean f58394Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f58395e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f58396g;
        private final boolean jB;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Parameters f58397o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f58398r;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f58399v;

        /* JADX INFO: Access modifiers changed from: private */
        public static int Uo(Wre wre, Wre wre2) {
            iF iFVarO = (wre.f58398r && wre.f58390S) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.O();
            return l3D.mUb().J2(Integer.valueOf(wre.f58396g), Integer.valueOf(wre2.f58396g), wre.f58397o.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.O() : DefaultTrackSelector.NO_ORDER).J2(Integer.valueOf(wre.E2), Integer.valueOf(wre2.E2), iFVarO).J2(Integer.valueOf(wre.f58396g), Integer.valueOf(wre2.f58396g), iFVarO).xMQ();
        }

        private int mUb(int i2, int i3) {
            if ((this.J2.roleFlags & 16384) != 0 || !DefaultTrackSelector.isSupported(i2, this.f58397o.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.f58398r && !this.f58397o.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!DefaultTrackSelector.isSupported(i2, false) || !this.f58394Z || !this.f58398r || this.J2.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.f58397o;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i2 & i3) == 0) ? 1 : 2;
        }

        public static nKK xMQ(int i2, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i3) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            nKK.j jVarGh = nKK.gh();
            for (int i5 = 0; i5 < trackGroup.length; i5++) {
                int pixelCount = trackGroup.getFormat(i5).getPixelCount();
                jVarGh.n(new Wre(i2, trackGroup, i5, parameters, iArr[i5], i3, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return jVarGh.gh();
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public boolean rl(Wre wre) {
            if (!this.f58389N && !Util.areEqual(this.J2.sampleMimeType, wre.J2.sampleMimeType)) {
                return false;
            }
            if (this.f58397o.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.Xw == wre.Xw && this.jB == wre.jB;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int n() {
            return this.f58399v;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Wre(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i5, int i7, boolean z2) {
            int i8;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Format format;
            int i9;
            int i10;
            int i11;
            Format format2;
            int i12;
            int i13;
            int i14;
            super(i2, trackGroup, i3);
            this.f58397o = parameters;
            if (parameters.allowVideoNonSeamlessAdaptiveness) {
                i8 = 24;
            } else {
                i8 = 16;
            }
            if (parameters.allowVideoMixedMimeTypeAdaptiveness && (i7 & i8) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f58389N = z3;
            if (z2 && (((i12 = (format2 = this.J2).width) == -1 || i12 <= parameters.maxVideoWidth) && ((i13 = format2.height) == -1 || i13 <= parameters.maxVideoHeight))) {
                float f3 = format2.frameRate;
                if ((f3 == -1.0f || f3 <= parameters.maxVideoFrameRate) && ((i14 = format2.bitrate) == -1 || i14 <= parameters.maxVideoBitrate)) {
                    z4 = true;
                }
            } else {
                z4 = false;
            }
            this.f58398r = z4;
            if (z2 && (((i9 = (format = this.J2).width) == -1 || i9 >= parameters.minVideoWidth) && ((i10 = format.height) == -1 || i10 >= parameters.minVideoHeight))) {
                float f4 = format.frameRate;
                if ((f4 == -1.0f || f4 >= parameters.minVideoFrameRate) && ((i11 = format.bitrate) == -1 || i11 >= parameters.minVideoBitrate)) {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
            this.f58394Z = z5;
            this.f58390S = DefaultTrackSelector.isSupported(i5, false);
            Format format3 = this.J2;
            this.f58396g = format3.bitrate;
            this.E2 = format3.getPixelCount();
            this.f58393X = DefaultTrackSelector.getRoleFlagMatchScore(this.J2.roleFlags, parameters.preferredVideoRoleFlags);
            int i15 = this.J2.roleFlags;
            if (i15 != 0 && (i15 & 1) == 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.f58391T = z6;
            int i16 = 0;
            while (true) {
                if (i16 < parameters.preferredVideoMimeTypes.size()) {
                    String str = this.J2.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredVideoMimeTypes.get(i16))) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    i16 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f58395e = i16;
            if (RendererCapabilities.getDecoderSupport(i5) == 128) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.Xw = z7;
            this.jB = RendererCapabilities.getHardwareAccelerationSupport(i5) == 64;
            this.f58392U = DefaultTrackSelector.getVideoCodecPreferenceScore(this.J2.sampleMimeType);
            this.f58399v = mUb(i5, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int J2(Wre wre, Wre wre2) {
            l3D l3dUo = l3D.mUb().Uo(wre.f58390S, wre2.f58390S).nr(wre.f58393X, wre2.f58393X).Uo(wre.f58391T, wre2.f58391T).Uo(wre.f58398r, wre2.f58398r).Uo(wre.f58394Z, wre2.f58394Z).J2(Integer.valueOf(wre.f58395e), Integer.valueOf(wre2.f58395e), iF.t().O()).Uo(wre.Xw, wre2.Xw).Uo(wre.jB, wre2.jB);
            if (wre.Xw && wre.jB) {
                l3dUo = l3dUo.nr(wre.f58392U, wre2.f58392U);
            }
            return l3dUo.xMQ();
        }

        public static int KN(List list, List list2) {
            return l3D.mUb().J2((Wre) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.qz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.J2((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }), (Wre) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.qz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.J2((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.qz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.J2((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }).nr(list.size(), list2.size()).J2((Wre) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.Pl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.Uo((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }), (Wre) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.Pl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.Uo((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.Pl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.Wre.Uo((DefaultTrackSelector.Wre) obj, (DefaultTrackSelector.Wre) obj2);
                }
            }).xMQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class n extends TrackInfo implements Comparable {
        private final int E2;
        private final int M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private final int f58400N;
        private final int P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private final Parameters f58401S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final boolean f58402T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private final int f58403U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final int f58404X;
        private final boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final String f58405Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f58406e;
        private final boolean eF;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f58407g;
        private final int jB;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f58408o;
        private final boolean p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f58409r;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f58410v;

        private int Uo(int i2, boolean z2) {
            if (!DefaultTrackSelector.isSupported(i2, this.f58401S.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.f58408o && !this.f58401S.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            if (!DefaultTrackSelector.isSupported(i2, false) || !this.f58408o || this.J2.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.f58401S;
            if (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate) {
                return 1;
            }
            return (parameters.allowMultipleAdaptiveSelections || !z2) ? 2 : 1;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public boolean rl(n nVar) {
            int i2;
            String str;
            int i3;
            Parameters parameters = this.f58401S;
            if (!parameters.allowAudioMixedChannelCountAdaptiveness && ((i3 = this.J2.channelCount) == -1 || i3 != nVar.J2.channelCount)) {
                return false;
            }
            if (!parameters.allowAudioMixedMimeTypeAdaptiveness && ((str = this.J2.sampleMimeType) == null || !TextUtils.equals(str, nVar.J2.sampleMimeType))) {
                return false;
            }
            Parameters parameters2 = this.f58401S;
            if (!parameters2.allowAudioMixedSampleRateAdaptiveness && ((i2 = this.J2.sampleRate) == -1 || i2 != nVar.J2.sampleRate)) {
                return false;
            }
            if (parameters2.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.p5 == nVar.p5 && this.eF == nVar.eF;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int n() {
            return this.f58409r;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public int compareTo(n nVar) {
            iF iFVarO = (this.f58408o && this.f58407g) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.O();
            l3D l3dJ2 = l3D.mUb().Uo(this.f58407g, nVar.f58407g).J2(Integer.valueOf(this.f58406e), Integer.valueOf(nVar.f58406e), iF.t().O()).nr(this.E2, nVar.E2).nr(this.f58404X, nVar.f58404X).Uo(this.Xw, nVar.Xw).Uo(this.f58402T, nVar.f58402T).J2(Integer.valueOf(this.f58400N), Integer.valueOf(nVar.f58400N), iF.t().O()).nr(this.f58410v, nVar.f58410v).Uo(this.f58408o, nVar.f58408o).J2(Integer.valueOf(this.M7), Integer.valueOf(nVar.M7), iF.t().O()).J2(Integer.valueOf(this.P5), Integer.valueOf(nVar.P5), this.f58401S.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.O() : DefaultTrackSelector.NO_ORDER).Uo(this.p5, nVar.p5).Uo(this.eF, nVar.eF).J2(Integer.valueOf(this.jB), Integer.valueOf(nVar.jB), iFVarO).J2(Integer.valueOf(this.f58403U), Integer.valueOf(nVar.f58403U), iFVarO);
            Integer numValueOf = Integer.valueOf(this.P5);
            Integer numValueOf2 = Integer.valueOf(nVar.P5);
            if (!Util.areEqual(this.f58405Z, nVar.f58405Z)) {
                iFVarO = DefaultTrackSelector.NO_ORDER;
            }
            return l3dJ2.J2(numValueOf, numValueOf2, iFVarO).xMQ();
        }

        public n(int i2, TrackGroup trackGroup, int i3, Parameters parameters, int i5, boolean z2, t1.eO eOVar) {
            int i7;
            int formatLanguageScore;
            boolean z3;
            boolean z4;
            boolean z5;
            int formatLanguageScore2;
            boolean z6;
            super(i2, trackGroup, i3);
            this.f58401S = parameters;
            this.f58405Z = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.J2.language);
            this.f58407g = DefaultTrackSelector.isSupported(i5, false);
            int i8 = 0;
            while (true) {
                i7 = Integer.MAX_VALUE;
                if (i8 < parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.J2, (String) parameters.preferredAudioLanguages.get(i8), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i8++;
                    }
                } else {
                    formatLanguageScore = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f58406e = i8;
            this.E2 = formatLanguageScore;
            this.f58404X = DefaultTrackSelector.getRoleFlagMatchScore(this.J2.roleFlags, parameters.preferredAudioRoleFlags);
            Format format = this.J2;
            int i9 = format.roleFlags;
            if (i9 != 0 && (i9 & 1) == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f58402T = z3;
            if ((format.selectionFlags & 1) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Xw = z4;
            int i10 = format.channelCount;
            this.jB = i10;
            this.f58403U = format.sampleRate;
            int i11 = format.bitrate;
            this.P5 = i11;
            if ((i11 == -1 || i11 <= parameters.maxAudioBitrate) && ((i10 == -1 || i10 <= parameters.maxAudioChannelCount) && eOVar.apply(format))) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f58408o = z5;
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i12 = 0;
            while (true) {
                if (i12 < systemLanguageCodes.length) {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.J2, systemLanguageCodes[i12], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    formatLanguageScore2 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f58400N = i12;
            this.f58410v = formatLanguageScore2;
            int i13 = 0;
            while (true) {
                if (i13 < parameters.preferredAudioMimeTypes.size()) {
                    String str = this.J2.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i13))) {
                        i7 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            this.M7 = i7;
            if (RendererCapabilities.getDecoderSupport(i5) == 128) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.p5 = z6;
            this.eF = RendererCapabilities.getHardwareAccelerationSupport(i5) == 64;
            this.f58409r = Uo(i5, z2);
        }

        public static nKK J2(int i2, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z2, t1.eO eOVar) {
            nKK.j jVarGh = nKK.gh();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                jVarGh.n(new n(i2, trackGroup, i3, parameters, iArr[i3], z2, eOVar));
            }
            return jVarGh.gh();
        }

        public static int t(List list, List list2) {
            return ((n) Collections.max(list)).compareTo((n) Collections.max(list2));
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new AdaptiveTrackSelection.Factory());
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i2 = 0; i2 < trackGroupArray.length; i2++) {
            TrackSelectionOverride trackSelectionOverride2 = (TrackSelectionOverride) trackSelectionParameters.overrides.get(trackGroupArray.get(i2));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    private static boolean isDolbyAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z2;
        boolean z3 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i5 = 0; i5 < mappedTrackInfo.getRendererCount(); i5++) {
            int rendererType = mappedTrackInfo.getRendererType(i5);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i5];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i5], mappedTrackInfo.getTrackGroups(i5), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i3 != -1) {
                        z2 = false;
                        break;
                    }
                    i3 = i5;
                } else {
                    if (i2 != -1) {
                        z2 = false;
                        break;
                    }
                    i2 = i5;
                }
            }
        }
        z2 = true;
        if (i3 != -1 && i2 != -1) {
            z3 = true;
        }
        if (z2 && z3) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurationArr[i3] = rendererConfiguration;
            rendererConfigurationArr[i2] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i2 = 0; i2 < exoTrackSelection.length(); i2++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        final boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i2) && mappedTrackInfo.getTrackGroups(i2).length > 0) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.CN3
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i3, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.J2(this.f58373n, parameters, z2, i3, trackGroup, iArr3);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.fuX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.n.t((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    protected ExoTrackSelection.Definition selectOtherTrack(int i2, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        w6 w6Var = null;
        int i3 = 0;
        for (int i5 = 0; i5 < trackGroupArray.length; i5++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i5);
            int[] iArr2 = iArr[i5];
            for (int i7 = 0; i7 < trackGroup2.length; i7++) {
                if (isSupported(iArr2[i7], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    w6 w6Var2 = new w6(trackGroup2.getFormat(i7), iArr2[i7]);
                    if (w6Var == null || w6Var2.compareTo(w6Var) > 0) {
                        trackGroup = trackGroup2;
                        i3 = i7;
                        w6Var = w6Var2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i3);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class TrackInfo {
        public final Format J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f58386O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58387n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TrackGroup f58388t;

        public interface Factory<T extends TrackInfo> {
            List<T> create(int i2, TrackGroup trackGroup, int[] iArr);
        }

        public abstract int n();

        public abstract boolean rl(TrackInfo trackInfo);

        public TrackInfo(int i2, TrackGroup trackGroup, int i3) {
            this.f58387n = i2;
            this.f58388t = trackGroup;
            this.f58386O = i3;
            this.J2 = trackGroup.getFormat(i3);
        }
    }

    private static final class w6 implements Comparable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f58411n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f58412t;

        public w6(Format format, int i2) {
            this.f58411n = (format.selectionFlags & 1) != 0;
            this.f58412t = DefaultTrackSelector.isSupported(i2, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(w6 w6Var) {
            return l3D.mUb().Uo(this.f58412t, w6Var.f58412t).Uo(this.f58411n, w6Var.f58411n).xMQ();
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point getMaxVideoSizeInViewport(boolean z2, int i2, int i3, int i5, int i7) {
        if (z2) {
            if ((i5 > i7) == (i2 > i3)) {
                i3 = i2;
                i2 = i3;
            }
        }
        int i8 = i5 * i2;
        int i9 = i7 * i3;
        return i8 >= i9 ? new Point(i3, Util.ceilDivide(i9, i5)) : new Point(Util.ceilDivide(i8, i7), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(Format format) {
        boolean z2;
        Ml ml;
        Ml ml2;
        synchronized (this.lock) {
            try {
                if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && format.channelCount > 2 && (!isDolbyAudio(format) || (Util.SDK_INT >= 32 && (ml2 = this.spatializer) != null && ml2.O()))) {
                    z2 = Util.SDK_INT >= 32 && (ml = this.spatializer) != null && ml.O() && this.spatializer.t() && this.spatializer.nr() && this.spatializer.n(this.audioAttributes, format);
                }
            } finally {
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z2;
        Ml ml;
        synchronized (this.lock) {
            try {
                z2 = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && Util.SDK_INT >= 32 && (ml = this.spatializer) != null && ml.O();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Nullable
    private <T extends TrackInfo> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i2, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i3;
        RandomAccess randomAccessO;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i5 = 0;
        while (i5 < rendererCount) {
            if (i2 == mappedTrackInfo2.getRendererType(i5)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i5);
                for (int i7 = 0; i7 < trackGroups.length; i7++) {
                    TrackGroup trackGroup = trackGroups.get(i7);
                    List<T> listCreate = factory.create(i5, trackGroup, iArr[i5][i7]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i8 = 0;
                    while (i8 < trackGroup.length) {
                        T t3 = listCreate.get(i8);
                        int iN = t3.n();
                        if (zArr[i8] || iN == 0) {
                            i3 = rendererCount;
                        } else {
                            if (iN == 1) {
                                randomAccessO = nKK.o(t3);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t3);
                                int i9 = i8 + 1;
                                while (i9 < trackGroup.length) {
                                    T t4 = listCreate.get(i9);
                                    int i10 = rendererCount;
                                    if (t4.n() == 2 && t3.rl(t4)) {
                                        arrayList2.add(t4);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    rendererCount = i10;
                                }
                                randomAccessO = arrayList2;
                            }
                            i3 = rendererCount;
                            arrayList.add(randomAccessO);
                        }
                        i8++;
                        rendererCount = i3;
                    }
                }
            }
            i5++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((TrackInfo) list.get(i11)).f58386O;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.f58388t, iArr2), Integer.valueOf(trackInfo.f58387n));
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
        Ml ml;
        synchronized (this.lock) {
            try {
                if (Util.SDK_INT >= 32 && (ml = this.spatializer) != null) {
                    ml.J2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.release();
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters, @Nullable final String str) throws ExoPlaybackException {
        return selectTracksForType(3, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.Dsr
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i2, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.I28.J2(i2, trackGroup, parameters, iArr2, str);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.aC
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.I28.t((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters;
        Ml ml;
        synchronized (this.lock) {
            try {
                parameters = this.parameters;
                if (parameters.constrainAudioChannelCountToDeviceCapabilities && Util.SDK_INT >= 32 && (ml = this.spatializer) != null) {
                    ml.rl(this, (Looper) Assertions.checkStateNotNull(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            int rendererType = mappedTrackInfo.getRendererType(i2);
            if (parameters.getRendererDisabled(i2) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i2] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i3 = 0; i3 < rendererCount; i3++) {
            rendererConfigurationArr[i3] = (parameters.getRendererDisabled(i3) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i3))) || (mappedTrackInfo.getRendererType(i3) != -2 && exoTrackSelectionArrCreateTrackSelections[i3] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.Ml
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i2, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.Wre.xMQ(i2, trackGroup, parameters, iArr3, iArr2[i2]);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.I28
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.Wre.KN((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    public static /* synthetic */ List J2(final DefaultTrackSelector defaultTrackSelector, Parameters parameters, boolean z2, int i2, TrackGroup trackGroup, int[] iArr) {
        defaultTrackSelector.getClass();
        return n.J2(i2, trackGroup, parameters, iArr, z2, new t1.eO() { // from class: com.google.android.exoplayer2.trackselection.Wre
            @Override // t1.eO
            public final boolean apply(Object obj) {
                return this.f58415n.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
            }
        });
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        ExoTrackSelection.Definition definition;
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i2 = 0; i2 < rendererCount; i2++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i2);
            if (parameters.hasSelectionOverride(i2, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i2, trackGroups);
                if (selectionOverride != null && selectionOverride.tracks.length != 0) {
                    definition = new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
                } else {
                    definition = null;
                }
                definitionArr[i2] = definition;
            }
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        ExoTrackSelection.Definition definition;
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < rendererCount; i2++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i2), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i3 = 0; i3 < rendererCount; i3++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.getRendererType(i3)));
            if (trackSelectionOverride != null) {
                if (!trackSelectionOverride.trackIndices.isEmpty() && mappedTrackInfo.getTrackGroups(i3).indexOf(trackSelectionOverride.mediaTrackGroup) != -1) {
                    definition = new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, com.google.common.primitives.Wre.az(trackSelectionOverride.trackIndices));
                } else {
                    definition = null;
                }
                definitionArr[i3] = definition;
            }
        }
    }

    protected static int getFormatLanguageScore(Format format, @Nullable String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 != null && strNormalizeUndeterminedLanguageToNull != null) {
            if (!strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) && !strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
                if (!Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z2 || strNormalizeUndeterminedLanguageToNull2 != null) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i2, int i3, boolean z2) {
        int i5;
        int i7 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i8 = 0; i8 < trackGroup.length; i8++) {
                Format format = trackGroup.getFormat(i8);
                int i9 = format.width;
                if (i9 > 0 && (i5 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z2, i2, i3, i9, i5);
                    int i10 = format.width;
                    int i11 = format.height;
                    int i12 = i10 * i11;
                    if (i10 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i11 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i12 < i7) {
                        i7 = i12;
                    }
                }
            }
        }
        return i7;
    }

    protected static boolean isSupported(int i2, boolean z2) {
        int formatSupport = RendererCapabilities.getFormatSupport(i2);
        if (formatSupport != 4) {
            if (!z2 || formatSupport != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Nullable
    protected static String normalizeUndeterminedLanguageToNull(@Nullable String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static /* synthetic */ int nr(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() != -1) {
                return -1;
            }
            return 0;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private void setParametersInternal(Parameters parameters) {
        boolean zEquals;
        Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (!zEquals) {
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
                Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
            }
            invalidate();
        }
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    protected ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        String str;
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack == null) {
            str = null;
        } else {
            Object obj = pairSelectAudioTrack.first;
            str = ((ExoTrackSelection.Definition) obj).group.getFormat(((ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i2 = 0; i2 < rendererCount; i2++) {
            int rendererType = mappedTrackInfo.getRendererType(i2);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                definitionArr[i2] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i2), iArr[i2], parameters);
            }
        }
        return definitionArr;
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, @Nullable Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof Parameters) {
            this.parameters = (Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        boolean z2 = context != null && Util.isTv(context);
        this.deviceIsTV = z2;
        if (!z2 && context != null && Util.SDK_INT >= 32) {
            this.spatializer = Ml.Uo(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }
}
