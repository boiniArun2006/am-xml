package com.vungle.ads.internal.protos;

import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.protobuf.AbstractC1923o;
import com.google.protobuf.C;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.KH;
import com.google.protobuf.QJ;
import com.google.protobuf.g9s;
import com.google.protobuf.j;
import com.google.protobuf.nKK;
import com.google.protobuf.pO;
import com.google.protobuf.yg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Sdk {

    public static final class MetricBatch extends g9s implements MetricBatchOrBuilder {
        private static final MetricBatch DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 1;
        private static volatile KH PARSER;
        private nKK.Dsr metrics_ = g9s.emptyProtobufList();

        public static final class Builder extends g9s.n implements MetricBatchOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addMetrics(SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(sDKMetric);
                return this;
            }

            public Builder setMetrics(int i2, SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).setMetrics(i2, sDKMetric);
                return this;
            }

            private Builder() {
                super(MetricBatch.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public SDKMetric getMetrics(int i2) {
                return ((MetricBatch) this.instance).getMetrics(i2);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public int getMetricsCount() {
                return ((MetricBatch) this.instance).getMetricsCount();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
            public List<SDKMetric> getMetricsList() {
                return Collections.unmodifiableList(((MetricBatch) this.instance).getMetricsList());
            }

            public Builder addAllMetrics(Iterable<? extends SDKMetric> iterable) {
                copyOnWrite();
                ((MetricBatch) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder addMetrics(int i2, SDKMetric sDKMetric) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(i2, sDKMetric);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((MetricBatch) this.instance).clearMetrics();
                return this;
            }

            public Builder removeMetrics(int i2) {
                copyOnWrite();
                ((MetricBatch) this.instance).removeMetrics(i2);
                return this;
            }

            public Builder setMetrics(int i2, SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).setMetrics(i2, (SDKMetric) builder.build());
                return this;
            }

            public Builder addMetrics(SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics((SDKMetric) builder.build());
                return this;
            }

            public Builder addMetrics(int i2, SDKMetric.Builder builder) {
                copyOnWrite();
                ((MetricBatch) this.instance).addMetrics(i2, (SDKMetric) builder.build());
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(sDKMetric);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricBatch) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            MetricBatch metricBatch = new MetricBatch();
            DEFAULT_INSTANCE = metricBatch;
            g9s.registerDefaultInstance(MetricBatch.class, metricBatch);
        }

        private void ensureMetricsIsMutable() {
            nKK.Dsr dsr = this.metrics_;
            if (dsr.isModifiable()) {
                return;
            }
            this.metrics_ = g9s.mutableCopy(dsr);
        }

        public static MetricBatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(MetricBatch metricBatch) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(metricBatch);
        }

        public static MetricBatch parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
            return (MetricBatch) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static MetricBatch parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
        }

        public static KH parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
                case 1:
                    return new MetricBatch();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"metrics_", SDKMetric.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (MetricBatch.class) {
                        try {
                            w6Var = PARSER;
                            if (w6Var == null) {
                                w6Var = new g9s.w6(DEFAULT_INSTANCE);
                                PARSER = w6Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return w6Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public SDKMetric getMetrics(int i2) {
            return (SDKMetric) this.metrics_.get(i2);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.MetricBatchOrBuilder
        public List<SDKMetric> getMetricsList() {
            return this.metrics_;
        }

        public SDKMetricOrBuilder getMetricsOrBuilder(int i2) {
            return (SDKMetricOrBuilder) this.metrics_.get(i2);
        }

        public List<? extends SDKMetricOrBuilder> getMetricsOrBuilderList() {
            return this.metrics_;
        }

        private MetricBatch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<? extends SDKMetric> iterable) {
            ensureMetricsIsMutable();
            j.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = g9s.emptyProtobufList();
        }

        public static MetricBatch parseFrom(C c2) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMetrics(int i2) {
            ensureMetricsIsMutable();
            this.metrics_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i2, SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i2, sDKMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(int i2, SDKMetric sDKMetric) {
            sDKMetric.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(i2, sDKMetric);
        }

        public static MetricBatch parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
        }

        public static MetricBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricBatch parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
        }

        public static MetricBatch parseFrom(InputStream inputStream) throws IOException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricBatch parseFrom(InputStream inputStream, QJ qj) throws IOException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static MetricBatch parseFrom(AbstractC1923o abstractC1923o) throws IOException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
        }

        public static MetricBatch parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            return (MetricBatch) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
        }
    }

    public interface MetricBatchOrBuilder extends pO {
        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        SDKMetric getMetrics(int i2);

        int getMetricsCount();

        List<SDKMetric> getMetricsList();

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();
    }

    public static final class SDKError extends g9s implements SDKErrorOrBuilder {
        public static final int ADSOURCE_FIELD_NUMBER = 16;
        public static final int ADSTATE_FIELD_NUMBER = 23;
        public static final int APPSTATE_FIELD_NUMBER = 17;
        public static final int AT_FIELD_NUMBER = 1;
        public static final int CONNECTIONTYPEDETAILANDROID_FIELD_NUMBER = 101;
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 10;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 9;
        public static final int CREATIVEID_FIELD_NUMBER = 12;
        private static final SDKError DEFAULT_INSTANCE;
        public static final int EVENTID_FIELD_NUMBER = 4;
        public static final int EXPERIMENTS_FIELD_NUMBER = 24;
        public static final int ISADOENABLED_FIELD_NUMBER = 20;
        public static final int ISADPODDING_FIELD_NUMBER = 22;
        public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
        public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
        public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
        public static final int MAKE_FIELD_NUMBER = 5;
        public static final int MEDIATIONNAME_FIELD_NUMBER = 18;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 6;
        public static final int OSVERSION_FIELD_NUMBER = 8;
        public static final int OS_FIELD_NUMBER = 7;
        private static volatile KH PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 11;
        public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        public static final int VMVERSION_FIELD_NUMBER = 19;
        private long appState_;
        private long at_;
        private boolean isAdPodding_;
        private boolean isAdoEnabled_;
        private long isHbPlacement_;
        private boolean isLowDataModeEnabled_;
        private boolean isPartialDownloadEnabled_;
        private int reason_;
        private String message_ = "";
        private String eventId_ = "";
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osVersion_ = "";
        private String connectionType_ = "";
        private String connectionTypeDetail_ = "";
        private String placementReferenceId_ = "";
        private String creativeId_ = "";
        private String sessionId_ = "";
        private String placementType_ = "";
        private String adSource_ = "";
        private String mediationName_ = "";
        private String vmVersion_ = "";
        private String adState_ = "";
        private String experiments_ = "";
        private String connectionTypeDetailAndroid_ = "";

        public static final class Builder extends g9s.n implements SDKErrorOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SDKError.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getAdSource() {
                return ((SDKError) this.instance).getAdSource();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getAdSourceBytes() {
                return ((SDKError) this.instance).getAdSourceBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getAdState() {
                return ((SDKError) this.instance).getAdState();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getAdStateBytes() {
                return ((SDKError) this.instance).getAdStateBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public long getAppState() {
                return ((SDKError) this.instance).getAppState();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public long getAt() {
                return ((SDKError) this.instance).getAt();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionType() {
                return ((SDKError) this.instance).getConnectionType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getConnectionTypeBytes() {
                return ((SDKError) this.instance).getConnectionTypeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionTypeDetail() {
                return ((SDKError) this.instance).getConnectionTypeDetail();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getConnectionTypeDetailAndroid() {
                return ((SDKError) this.instance).getConnectionTypeDetailAndroid();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getConnectionTypeDetailAndroidBytes() {
                return ((SDKError) this.instance).getConnectionTypeDetailAndroidBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getConnectionTypeDetailBytes() {
                return ((SDKError) this.instance).getConnectionTypeDetailBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getCreativeId() {
                return ((SDKError) this.instance).getCreativeId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getCreativeIdBytes() {
                return ((SDKError) this.instance).getCreativeIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getEventId() {
                return ((SDKError) this.instance).getEventId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getEventIdBytes() {
                return ((SDKError) this.instance).getEventIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getExperiments() {
                return ((SDKError) this.instance).getExperiments();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getExperimentsBytes() {
                return ((SDKError) this.instance).getExperimentsBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public boolean getIsAdPodding() {
                return ((SDKError) this.instance).getIsAdPodding();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public boolean getIsAdoEnabled() {
                return ((SDKError) this.instance).getIsAdoEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public long getIsHbPlacement() {
                return ((SDKError) this.instance).getIsHbPlacement();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public boolean getIsLowDataModeEnabled() {
                return ((SDKError) this.instance).getIsLowDataModeEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public boolean getIsPartialDownloadEnabled() {
                return ((SDKError) this.instance).getIsPartialDownloadEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getMake() {
                return ((SDKError) this.instance).getMake();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getMakeBytes() {
                return ((SDKError) this.instance).getMakeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getMediationName() {
                return ((SDKError) this.instance).getMediationName();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getMediationNameBytes() {
                return ((SDKError) this.instance).getMediationNameBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getMessage() {
                return ((SDKError) this.instance).getMessage();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getMessageBytes() {
                return ((SDKError) this.instance).getMessageBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getModel() {
                return ((SDKError) this.instance).getModel();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getModelBytes() {
                return ((SDKError) this.instance).getModelBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getOs() {
                return ((SDKError) this.instance).getOs();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getOsBytes() {
                return ((SDKError) this.instance).getOsBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getOsVersion() {
                return ((SDKError) this.instance).getOsVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getOsVersionBytes() {
                return ((SDKError) this.instance).getOsVersionBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getPlacementReferenceId() {
                return ((SDKError) this.instance).getPlacementReferenceId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getPlacementReferenceIdBytes() {
                return ((SDKError) this.instance).getPlacementReferenceIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getPlacementType() {
                return ((SDKError) this.instance).getPlacementType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getPlacementTypeBytes() {
                return ((SDKError) this.instance).getPlacementTypeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public Reason getReason() {
                return ((SDKError) this.instance).getReason();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public int getReasonValue() {
                return ((SDKError) this.instance).getReasonValue();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getSessionId() {
                return ((SDKError) this.instance).getSessionId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getSessionIdBytes() {
                return ((SDKError) this.instance).getSessionIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public String getVmVersion() {
                return ((SDKError) this.instance).getVmVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
            public C getVmVersionBytes() {
                return ((SDKError) this.instance).getVmVersionBytes();
            }

            public Builder clearAdSource() {
                copyOnWrite();
                ((SDKError) this.instance).clearAdSource();
                return this;
            }

            public Builder clearAdState() {
                copyOnWrite();
                ((SDKError) this.instance).clearAdState();
                return this;
            }

            public Builder clearAppState() {
                copyOnWrite();
                ((SDKError) this.instance).clearAppState();
                return this;
            }

            public Builder clearAt() {
                copyOnWrite();
                ((SDKError) this.instance).clearAt();
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionType();
                return this;
            }

            public Builder clearConnectionTypeDetail() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionTypeDetail();
                return this;
            }

            public Builder clearConnectionTypeDetailAndroid() {
                copyOnWrite();
                ((SDKError) this.instance).clearConnectionTypeDetailAndroid();
                return this;
            }

            public Builder clearCreativeId() {
                copyOnWrite();
                ((SDKError) this.instance).clearCreativeId();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((SDKError) this.instance).clearEventId();
                return this;
            }

            public Builder clearExperiments() {
                copyOnWrite();
                ((SDKError) this.instance).clearExperiments();
                return this;
            }

            public Builder clearIsAdPodding() {
                copyOnWrite();
                ((SDKError) this.instance).clearIsAdPodding();
                return this;
            }

            public Builder clearIsAdoEnabled() {
                copyOnWrite();
                ((SDKError) this.instance).clearIsAdoEnabled();
                return this;
            }

            public Builder clearIsHbPlacement() {
                copyOnWrite();
                ((SDKError) this.instance).clearIsHbPlacement();
                return this;
            }

            public Builder clearIsLowDataModeEnabled() {
                copyOnWrite();
                ((SDKError) this.instance).clearIsLowDataModeEnabled();
                return this;
            }

            public Builder clearIsPartialDownloadEnabled() {
                copyOnWrite();
                ((SDKError) this.instance).clearIsPartialDownloadEnabled();
                return this;
            }

            public Builder clearMake() {
                copyOnWrite();
                ((SDKError) this.instance).clearMake();
                return this;
            }

            public Builder clearMediationName() {
                copyOnWrite();
                ((SDKError) this.instance).clearMediationName();
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                ((SDKError) this.instance).clearMessage();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((SDKError) this.instance).clearModel();
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((SDKError) this.instance).clearOs();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((SDKError) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlacementReferenceId() {
                copyOnWrite();
                ((SDKError) this.instance).clearPlacementReferenceId();
                return this;
            }

            public Builder clearPlacementType() {
                copyOnWrite();
                ((SDKError) this.instance).clearPlacementType();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((SDKError) this.instance).clearReason();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SDKError) this.instance).clearSessionId();
                return this;
            }

            public Builder clearVmVersion() {
                copyOnWrite();
                ((SDKError) this.instance).clearVmVersion();
                return this;
            }

            public Builder setAdSource(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setAdSource(str);
                return this;
            }

            public Builder setAdSourceBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setAdSourceBytes(c2);
                return this;
            }

            public Builder setAdState(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setAdState(str);
                return this;
            }

            public Builder setAdStateBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setAdStateBytes(c2);
                return this;
            }

            public Builder setAppState(long j2) {
                copyOnWrite();
                ((SDKError) this.instance).setAppState(j2);
                return this;
            }

            public Builder setAt(long j2) {
                copyOnWrite();
                ((SDKError) this.instance).setAt(j2);
                return this;
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionType(str);
                return this;
            }

            public Builder setConnectionTypeBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeBytes(c2);
                return this;
            }

            public Builder setConnectionTypeDetail(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetail(str);
                return this;
            }

            public Builder setConnectionTypeDetailAndroid(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailAndroid(str);
                return this;
            }

            public Builder setConnectionTypeDetailAndroidBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailAndroidBytes(c2);
                return this;
            }

            public Builder setConnectionTypeDetailBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setConnectionTypeDetailBytes(c2);
                return this;
            }

            public Builder setCreativeId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setCreativeId(str);
                return this;
            }

            public Builder setCreativeIdBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setCreativeIdBytes(c2);
                return this;
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setEventId(str);
                return this;
            }

            public Builder setEventIdBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setEventIdBytes(c2);
                return this;
            }

            public Builder setExperiments(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setExperiments(str);
                return this;
            }

            public Builder setExperimentsBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setExperimentsBytes(c2);
                return this;
            }

            public Builder setIsAdPodding(boolean z2) {
                copyOnWrite();
                ((SDKError) this.instance).setIsAdPodding(z2);
                return this;
            }

            public Builder setIsAdoEnabled(boolean z2) {
                copyOnWrite();
                ((SDKError) this.instance).setIsAdoEnabled(z2);
                return this;
            }

            public Builder setIsHbPlacement(long j2) {
                copyOnWrite();
                ((SDKError) this.instance).setIsHbPlacement(j2);
                return this;
            }

            public Builder setIsLowDataModeEnabled(boolean z2) {
                copyOnWrite();
                ((SDKError) this.instance).setIsLowDataModeEnabled(z2);
                return this;
            }

            public Builder setIsPartialDownloadEnabled(boolean z2) {
                copyOnWrite();
                ((SDKError) this.instance).setIsPartialDownloadEnabled(z2);
                return this;
            }

            public Builder setMake(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setMake(str);
                return this;
            }

            public Builder setMakeBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setMakeBytes(c2);
                return this;
            }

            public Builder setMediationName(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setMediationName(str);
                return this;
            }

            public Builder setMediationNameBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setMediationNameBytes(c2);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setMessage(str);
                return this;
            }

            public Builder setMessageBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setMessageBytes(c2);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setModelBytes(c2);
                return this;
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setOs(str);
                return this;
            }

            public Builder setOsBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setOsBytes(c2);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setOsVersionBytes(c2);
                return this;
            }

            public Builder setPlacementReferenceId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementReferenceId(str);
                return this;
            }

            public Builder setPlacementReferenceIdBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementReferenceIdBytes(c2);
                return this;
            }

            public Builder setPlacementType(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementType(str);
                return this;
            }

            public Builder setPlacementTypeBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setPlacementTypeBytes(c2);
                return this;
            }

            public Builder setReason(Reason reason) {
                copyOnWrite();
                ((SDKError) this.instance).setReason(reason);
                return this;
            }

            public Builder setReasonValue(int i2) {
                copyOnWrite();
                ((SDKError) this.instance).setReasonValue(i2);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setSessionIdBytes(c2);
                return this;
            }

            public Builder setVmVersion(String str) {
                copyOnWrite();
                ((SDKError) this.instance).setVmVersion(str);
                return this;
            }

            public Builder setVmVersionBytes(C c2) {
                copyOnWrite();
                ((SDKError) this.instance).setVmVersionBytes(c2);
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public enum Reason implements nKK.w6 {
            UNKNOWN_ERROR(0),
            INVALID_APP_ID(2),
            CURRENTLY_INITIALIZING(3),
            ALREADY_INITIALIZED(4),
            SDK_NOT_INITIALIZED(6),
            USER_AGENT_ERROR(7),
            API_REQUEST_ERROR(101),
            API_RESPONSE_DATA_ERROR(102),
            API_RESPONSE_DECODE_ERROR(103),
            API_FAILED_STATUS_CODE(104),
            INVALID_TEMPLATE_URL(105),
            INVALID_REQUEST_BUILDER_ERROR(106),
            TEMPLATE_UNZIP_ERROR(109),
            INVALID_CTA_URL(110),
            INVALID_ASSET_URL(111),
            ASSET_REQUEST_ERROR(112),
            ASSET_RESPONSE_DATA_ERROR(113),
            ASSET_WRITE_ERROR(114),
            INVALID_INDEX_URL(115),
            GZIP_ENCODE_ERROR(116),
            ASSET_FAILED_STATUS_CODE(ASSET_FAILED_STATUS_CODE_VALUE),
            PROTOBUF_SERIALIZATION_ERROR(PROTOBUF_SERIALIZATION_ERROR_VALUE),
            JSON_ENCODE_ERROR(JSON_ENCODE_ERROR_VALUE),
            TPAT_ERROR(TPAT_ERROR_VALUE),
            INVALID_ADS_ENDPOINT(INVALID_ADS_ENDPOINT_VALUE),
            INVALID_RI_ENDPOINT(INVALID_RI_ENDPOINT_VALUE),
            INVALID_LOG_ERROR_ENDPOINT(INVALID_LOG_ERROR_ENDPOINT_VALUE),
            INVALID_METRICS_ENDPOINT(INVALID_METRICS_ENDPOINT_VALUE),
            ASSET_FAILED_INSUFFICIENT_SPACE(126),
            ASSET_FAILED_MAX_SPACE_EXCEEDED(127),
            INVALID_TPAT_KEY(128),
            EMPTY_TPAT_ERROR(129),
            MRAID_DOWNLOAD_JS_ERROR(130),
            MRAID_JS_WRITE_FAILED(MRAID_JS_WRITE_FAILED_VALUE),
            OMSDK_DOWNLOAD_JS_ERROR(OMSDK_DOWNLOAD_JS_ERROR_VALUE),
            OMSDK_JS_WRITE_FAILED(OMSDK_JS_WRITE_FAILED_VALUE),
            STORE_REGION_CODE_ERROR(134),
            INVALID_CONFIG_RESPONSE(135),
            PRIVACY_URL_ERROR(136),
            TPAT_RETRY_FAILED(TPAT_RETRY_FAILED_VALUE),
            CONFIG_REFRESH_FAILED(138),
            INVALID_EVENT_ID_ERROR(200),
            INVALID_PLACEMENT_ID(201),
            AD_CONSUMED(AD_CONSUMED_VALUE),
            AD_IS_LOADING(AD_IS_LOADING_VALUE),
            AD_ALREADY_LOADED(204),
            AD_IS_PLAYING(AD_IS_PLAYING_VALUE),
            AD_ALREADY_FAILED(AD_ALREADY_FAILED_VALUE),
            PLACEMENT_AD_TYPE_MISMATCH(PLACEMENT_AD_TYPE_MISMATCH_VALUE),
            INVALID_BID_PAYLOAD(INVALID_BID_PAYLOAD_VALUE),
            INVALID_JSON_BID_PAYLOAD(INVALID_JSON_BID_PAYLOAD_VALUE),
            AD_NOT_LOADED(AD_NOT_LOADED_VALUE),
            PLACEMENT_SLEEP(PLACEMENT_SLEEP_VALUE),
            INVALID_ADUNIT_BID_PAYLOAD(INVALID_ADUNIT_BID_PAYLOAD_VALUE),
            INVALID_GZIP_BID_PAYLOAD(INVALID_GZIP_BID_PAYLOAD_VALUE),
            AD_RESPONSE_EMPTY(AD_RESPONSE_EMPTY_VALUE),
            AD_RESPONSE_INVALID_TEMPLATE_TYPE(AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE),
            AD_RESPONSE_TIMED_OUT(AD_RESPONSE_TIMED_OUT_VALUE),
            MRAID_JS_DOES_NOT_EXIST(MRAID_JS_DOES_NOT_EXIST_VALUE),
            MRAID_JS_COPY_FAILED(MRAID_JS_COPY_FAILED_VALUE),
            AD_RESPONSE_RETRY_AFTER(AD_RESPONSE_RETRY_AFTER_VALUE),
            AD_LOAD_FAIL_RETRY_AFTER(AD_LOAD_FAIL_RETRY_AFTER_VALUE),
            INVALID_WATERFALL_PLACEMENT_ID(INVALID_WATERFALL_PLACEMENT_ID_VALUE),
            STALE_CACHED_RESPONSE(STALE_CACHED_RESPONSE_VALUE),
            AD_LOAD_FAIL_EMPTY_BID_PAYLOAD(224),
            AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH(AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE),
            PRIVACY_ICON_FALLBACK_ERROR(PRIVACY_ICON_FALLBACK_ERROR_VALUE),
            MRAID_ERROR(MRAID_ERROR_VALUE),
            INVALID_IFA_STATUS(INVALID_IFA_STATUS_VALUE),
            AD_EXPIRED(AD_EXPIRED_VALUE),
            MRAID_BRIDGE_ERROR(MRAID_BRIDGE_ERROR_VALUE),
            AD_EXPIRED_ON_PLAY(307),
            AD_WIN_NOTIFICATION_ERROR(308),
            ASSET_FAILED_TO_DELETE(ASSET_FAILED_TO_DELETE_VALUE),
            AD_HTML_FAILED_TO_LOAD(AD_HTML_FAILED_TO_LOAD_VALUE),
            MRAID_JS_CALL_EMPTY(MRAID_JS_CALL_EMPTY_VALUE),
            DEEPLINK_OPEN_FAILED(DEEPLINK_OPEN_FAILED_VALUE),
            EVALUATE_JAVASCRIPT_FAILED(EVALUATE_JAVASCRIPT_FAILED_VALUE),
            LINK_COMMAND_OPEN_FAILED(LINK_COMMAND_OPEN_FAILED_VALUE),
            JSON_PARAMS_ENCODE_ERROR(JSON_PARAMS_ENCODE_ERROR_VALUE),
            GENERATE_JSON_DATA_ERROR(GENERATE_JSON_DATA_ERROR_VALUE),
            AD_CLOSED_TEMPLATE_ERROR(AD_CLOSED_TEMPLATE_ERROR_VALUE),
            AD_CLOSED_MISSING_HEARTBEAT(AD_CLOSED_MISSING_HEARTBEAT_VALUE),
            SILENT_MODE_MONITOR_ERROR(SILENT_MODE_MONITOR_ERROR_VALUE),
            WEBVIEW_ERROR(WEBVIEW_ERROR_VALUE),
            BLACK_SCREEN_DETECTION_ERROR(BLACK_SCREEN_DETECTION_ERROR_VALUE),
            CONCURRENT_PLAYBACK_UNSUPPORTED(CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE),
            BANNER_VIEW_INVALID_SIZE(500),
            NATIVE_ASSET_ERROR(NATIVE_ASSET_ERROR_VALUE),
            NATIVE_VIDEO_PLAYBACK_ERROR(NATIVE_VIDEO_PLAYBACK_ERROR_VALUE),
            WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE(2000),
            WEB_VIEW_FAILED_NAVIGATION(2001),
            STORE_KIT_LOAD_ERROR(2002),
            OMSDK_COPY_ERROR(2003),
            STORE_OVERLAY_LOAD_ERROR(2004),
            REACHABILITY_INITIALIZATION_FAILED(2005),
            UNKNOWN_RADIO_ACCESS_TECHNOLOGY(2006),
            STORE_KIT_PRESENTATION_ERROR(2007),
            STORE_OVERLAY_PRESENTATION_ERROR(2008),
            INVALID_PLAY_PARAMETER(2009),
            STORE_OVERLAY_DISMISSAL_ERROR(2010),
            PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION(2011),
            APP_IMPRESSION_CREATION_FAILED(2012),
            HANDLE_TAP_FAILED(2013),
            OUT_OF_MEMORY(3001),
            INLINE_INSTALL_ERROR(3002),
            VUNGLE_OIT_CREATION_ERROR(VUNGLE_OIT_CREATION_ERROR_VALUE),
            AD_NO_FILL(10001),
            AD_LOAD_TOO_FREQUENTLY(AD_LOAD_TOO_FREQUENTLY_VALUE),
            AD_SERVER_ERROR(AD_SERVER_ERROR_VALUE),
            AD_PUBLISHER_MISMATCH(AD_PUBLISHER_MISMATCH_VALUE),
            AD_INTERNAL_INTEGRATION_ERROR(AD_INTERNAL_INTEGRATION_ERROR_VALUE),
            CONFIG_NOT_FOUND_ERROR(CONFIG_NOT_FOUND_ERROR_VALUE),
            UNRECOGNIZED(-1);

            public static final int AD_ALREADY_FAILED_VALUE = 206;
            public static final int AD_ALREADY_LOADED_VALUE = 204;
            public static final int AD_CLOSED_MISSING_HEARTBEAT_VALUE = 318;
            public static final int AD_CLOSED_TEMPLATE_ERROR_VALUE = 317;
            public static final int AD_CONSUMED_VALUE = 202;
            public static final int AD_EXPIRED_ON_PLAY_VALUE = 307;
            public static final int AD_EXPIRED_VALUE = 304;
            public static final int AD_HTML_FAILED_TO_LOAD_VALUE = 310;
            public static final int AD_INTERNAL_INTEGRATION_ERROR_VALUE = 30002;
            public static final int AD_IS_LOADING_VALUE = 203;
            public static final int AD_IS_PLAYING_VALUE = 205;
            public static final int AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE = 224;
            public static final int AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE = 225;
            public static final int AD_LOAD_FAIL_RETRY_AFTER_VALUE = 221;
            public static final int AD_LOAD_TOO_FREQUENTLY_VALUE = 10002;
            public static final int AD_NOT_LOADED_VALUE = 210;
            public static final int AD_NO_FILL_VALUE = 10001;
            public static final int AD_PUBLISHER_MISMATCH_VALUE = 30001;
            public static final int AD_RESPONSE_EMPTY_VALUE = 215;
            public static final int AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE = 216;
            public static final int AD_RESPONSE_RETRY_AFTER_VALUE = 220;
            public static final int AD_RESPONSE_TIMED_OUT_VALUE = 217;
            public static final int AD_SERVER_ERROR_VALUE = 20001;

            @Deprecated
            public static final int AD_WIN_NOTIFICATION_ERROR_VALUE = 308;

            @Deprecated
            public static final int ALREADY_INITIALIZED_VALUE = 4;
            public static final int API_FAILED_STATUS_CODE_VALUE = 104;
            public static final int API_REQUEST_ERROR_VALUE = 101;
            public static final int API_RESPONSE_DATA_ERROR_VALUE = 102;
            public static final int API_RESPONSE_DECODE_ERROR_VALUE = 103;
            public static final int APP_IMPRESSION_CREATION_FAILED_VALUE = 2012;
            public static final int ASSET_FAILED_INSUFFICIENT_SPACE_VALUE = 126;

            @Deprecated
            public static final int ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE = 127;

            @Deprecated
            public static final int ASSET_FAILED_STATUS_CODE_VALUE = 117;
            public static final int ASSET_FAILED_TO_DELETE_VALUE = 309;
            public static final int ASSET_REQUEST_ERROR_VALUE = 112;

            @Deprecated
            public static final int ASSET_RESPONSE_DATA_ERROR_VALUE = 113;
            public static final int ASSET_WRITE_ERROR_VALUE = 114;
            public static final int BANNER_VIEW_INVALID_SIZE_VALUE = 500;
            public static final int BLACK_SCREEN_DETECTION_ERROR_VALUE = 321;
            public static final int CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE = 400;
            public static final int CONFIG_NOT_FOUND_ERROR_VALUE = 30003;
            public static final int CONFIG_REFRESH_FAILED_VALUE = 138;

            @Deprecated
            public static final int CURRENTLY_INITIALIZING_VALUE = 3;
            public static final int DEEPLINK_OPEN_FAILED_VALUE = 312;
            public static final int EMPTY_TPAT_ERROR_VALUE = 129;
            public static final int EVALUATE_JAVASCRIPT_FAILED_VALUE = 313;
            public static final int GENERATE_JSON_DATA_ERROR_VALUE = 316;
            public static final int GZIP_ENCODE_ERROR_VALUE = 116;
            public static final int HANDLE_TAP_FAILED_VALUE = 2013;
            public static final int INLINE_INSTALL_ERROR_VALUE = 3002;
            public static final int INVALID_ADS_ENDPOINT_VALUE = 122;
            public static final int INVALID_ADUNIT_BID_PAYLOAD_VALUE = 213;
            public static final int INVALID_APP_ID_VALUE = 2;
            public static final int INVALID_ASSET_URL_VALUE = 111;
            public static final int INVALID_BID_PAYLOAD_VALUE = 208;
            public static final int INVALID_CONFIG_RESPONSE_VALUE = 135;
            public static final int INVALID_CTA_URL_VALUE = 110;
            public static final int INVALID_EVENT_ID_ERROR_VALUE = 200;
            public static final int INVALID_GZIP_BID_PAYLOAD_VALUE = 214;
            public static final int INVALID_IFA_STATUS_VALUE = 302;
            public static final int INVALID_INDEX_URL_VALUE = 115;
            public static final int INVALID_JSON_BID_PAYLOAD_VALUE = 209;
            public static final int INVALID_LOG_ERROR_ENDPOINT_VALUE = 124;
            public static final int INVALID_METRICS_ENDPOINT_VALUE = 125;
            public static final int INVALID_PLACEMENT_ID_VALUE = 201;
            public static final int INVALID_PLAY_PARAMETER_VALUE = 2009;
            public static final int INVALID_REQUEST_BUILDER_ERROR_VALUE = 106;
            public static final int INVALID_RI_ENDPOINT_VALUE = 123;
            public static final int INVALID_TEMPLATE_URL_VALUE = 105;
            public static final int INVALID_TPAT_KEY_VALUE = 128;

            @Deprecated
            public static final int INVALID_WATERFALL_PLACEMENT_ID_VALUE = 222;
            public static final int JSON_ENCODE_ERROR_VALUE = 119;
            public static final int JSON_PARAMS_ENCODE_ERROR_VALUE = 315;
            public static final int LINK_COMMAND_OPEN_FAILED_VALUE = 314;
            public static final int MRAID_BRIDGE_ERROR_VALUE = 305;
            public static final int MRAID_DOWNLOAD_JS_ERROR_VALUE = 130;
            public static final int MRAID_ERROR_VALUE = 301;
            public static final int MRAID_JS_CALL_EMPTY_VALUE = 311;
            public static final int MRAID_JS_COPY_FAILED_VALUE = 219;
            public static final int MRAID_JS_DOES_NOT_EXIST_VALUE = 218;
            public static final int MRAID_JS_WRITE_FAILED_VALUE = 131;
            public static final int NATIVE_ASSET_ERROR_VALUE = 600;
            public static final int NATIVE_VIDEO_PLAYBACK_ERROR_VALUE = 601;
            public static final int OMSDK_COPY_ERROR_VALUE = 2003;
            public static final int OMSDK_DOWNLOAD_JS_ERROR_VALUE = 132;
            public static final int OMSDK_JS_WRITE_FAILED_VALUE = 133;
            public static final int OUT_OF_MEMORY_VALUE = 3001;
            public static final int PLACEMENT_AD_TYPE_MISMATCH_VALUE = 207;
            public static final int PLACEMENT_SLEEP_VALUE = 212;
            public static final int PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION_VALUE = 2011;
            public static final int PRIVACY_ICON_FALLBACK_ERROR_VALUE = 226;
            public static final int PRIVACY_URL_ERROR_VALUE = 136;
            public static final int PROTOBUF_SERIALIZATION_ERROR_VALUE = 118;
            public static final int REACHABILITY_INITIALIZATION_FAILED_VALUE = 2005;
            public static final int SDK_NOT_INITIALIZED_VALUE = 6;
            public static final int SILENT_MODE_MONITOR_ERROR_VALUE = 319;
            public static final int STALE_CACHED_RESPONSE_VALUE = 223;
            public static final int STORE_KIT_LOAD_ERROR_VALUE = 2002;
            public static final int STORE_KIT_PRESENTATION_ERROR_VALUE = 2007;
            public static final int STORE_OVERLAY_DISMISSAL_ERROR_VALUE = 2010;
            public static final int STORE_OVERLAY_LOAD_ERROR_VALUE = 2004;
            public static final int STORE_OVERLAY_PRESENTATION_ERROR_VALUE = 2008;
            public static final int STORE_REGION_CODE_ERROR_VALUE = 134;
            public static final int TEMPLATE_UNZIP_ERROR_VALUE = 109;
            public static final int TPAT_ERROR_VALUE = 121;
            public static final int TPAT_RETRY_FAILED_VALUE = 137;
            public static final int UNKNOWN_ERROR_VALUE = 0;
            public static final int UNKNOWN_RADIO_ACCESS_TECHNOLOGY_VALUE = 2006;
            public static final int USER_AGENT_ERROR_VALUE = 7;
            public static final int VUNGLE_OIT_CREATION_ERROR_VALUE = 4000;
            public static final int WEBVIEW_ERROR_VALUE = 320;
            public static final int WEB_VIEW_FAILED_NAVIGATION_VALUE = 2001;
            public static final int WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE_VALUE = 2000;
            private static final nKK.Ml internalValueMap = new nKK.Ml() { // from class: com.vungle.ads.internal.protos.Sdk.SDKError.Reason.1
                @Override // com.google.protobuf.nKK.Ml
                public Reason findValueByNumber(int i2) {
                    return Reason.forNumber(i2);
                }
            };
            private final int value;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            private static final class ReasonVerifier implements nKK.I28 {
                static final nKK.I28 INSTANCE = new ReasonVerifier();

                private ReasonVerifier() {
                }

                @Override // com.google.protobuf.nKK.I28
                public boolean isInRange(int i2) {
                    if (Reason.forNumber(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            public static Reason forNumber(int i2) {
                if (i2 != 0) {
                    if (i2 == 2) {
                        return INVALID_APP_ID;
                    }
                    if (i2 == 3) {
                        return CURRENTLY_INITIALIZING;
                    }
                    if (i2 == 4) {
                        return ALREADY_INITIALIZED;
                    }
                    if (i2 == 6) {
                        return SDK_NOT_INITIALIZED;
                    }
                    if (i2 == 7) {
                        return USER_AGENT_ERROR;
                    }
                    if (i2 == 301) {
                        return MRAID_ERROR;
                    }
                    if (i2 == 302) {
                        return INVALID_IFA_STATUS;
                    }
                    if (i2 == 304) {
                        return AD_EXPIRED;
                    }
                    if (i2 == 305) {
                        return MRAID_BRIDGE_ERROR;
                    }
                    switch (i2) {
                        case 0:
                            break;
                        case TPAT_ERROR_VALUE:
                            return TPAT_ERROR;
                        case INVALID_ADS_ENDPOINT_VALUE:
                            return INVALID_ADS_ENDPOINT;
                        case INVALID_RI_ENDPOINT_VALUE:
                            return INVALID_RI_ENDPOINT;
                        case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                            return INVALID_LOG_ERROR_ENDPOINT;
                        case INVALID_METRICS_ENDPOINT_VALUE:
                            return INVALID_METRICS_ENDPOINT;
                        case 126:
                            return ASSET_FAILED_INSUFFICIENT_SPACE;
                        case 127:
                            return ASSET_FAILED_MAX_SPACE_EXCEEDED;
                        case 128:
                            return INVALID_TPAT_KEY;
                        case 129:
                            return EMPTY_TPAT_ERROR;
                        case 130:
                            return MRAID_DOWNLOAD_JS_ERROR;
                        case MRAID_JS_WRITE_FAILED_VALUE:
                            return MRAID_JS_WRITE_FAILED;
                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                            return OMSDK_DOWNLOAD_JS_ERROR;
                        case OMSDK_JS_WRITE_FAILED_VALUE:
                            return OMSDK_JS_WRITE_FAILED;
                        case 134:
                            return STORE_REGION_CODE_ERROR;
                        case 135:
                            return INVALID_CONFIG_RESPONSE;
                        case 136:
                            return PRIVACY_URL_ERROR;
                        case TPAT_RETRY_FAILED_VALUE:
                            return TPAT_RETRY_FAILED;
                        case 138:
                            return CONFIG_REFRESH_FAILED;
                        case CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE:
                            return CONCURRENT_PLAYBACK_UNSUPPORTED;
                        case 500:
                            return BANNER_VIEW_INVALID_SIZE;
                        case NATIVE_ASSET_ERROR_VALUE:
                            return NATIVE_ASSET_ERROR;
                        case NATIVE_VIDEO_PLAYBACK_ERROR_VALUE:
                            return NATIVE_VIDEO_PLAYBACK_ERROR;
                        case 2000:
                            return WEB_VIEW_WEB_CONTENT_PROCESS_DID_TERMINATE;
                        case 2001:
                            return WEB_VIEW_FAILED_NAVIGATION;
                        case 2002:
                            return STORE_KIT_LOAD_ERROR;
                        case 2003:
                            return OMSDK_COPY_ERROR;
                        case 2004:
                            return STORE_OVERLAY_LOAD_ERROR;
                        case 2005:
                            return REACHABILITY_INITIALIZATION_FAILED;
                        case 2006:
                            return UNKNOWN_RADIO_ACCESS_TECHNOLOGY;
                        case 2007:
                            return STORE_KIT_PRESENTATION_ERROR;
                        case 2008:
                            return STORE_OVERLAY_PRESENTATION_ERROR;
                        case 2009:
                            return INVALID_PLAY_PARAMETER;
                        case 2010:
                            return STORE_OVERLAY_DISMISSAL_ERROR;
                        case 2011:
                            return PRESENTER_DEALLOCATED_BEFORE_LOAD_COMPLETION;
                        case 2012:
                            return APP_IMPRESSION_CREATION_FAILED;
                        case 2013:
                            return HANDLE_TAP_FAILED;
                        case 3001:
                            return OUT_OF_MEMORY;
                        case 3002:
                            return INLINE_INSTALL_ERROR;
                        case VUNGLE_OIT_CREATION_ERROR_VALUE:
                            return VUNGLE_OIT_CREATION_ERROR;
                        case 10001:
                            return AD_NO_FILL;
                        case AD_LOAD_TOO_FREQUENTLY_VALUE:
                            return AD_LOAD_TOO_FREQUENTLY;
                        case AD_SERVER_ERROR_VALUE:
                            return AD_SERVER_ERROR;
                        case AD_PUBLISHER_MISMATCH_VALUE:
                            return AD_PUBLISHER_MISMATCH;
                        case AD_INTERNAL_INTEGRATION_ERROR_VALUE:
                            return AD_INTERNAL_INTEGRATION_ERROR;
                        case CONFIG_NOT_FOUND_ERROR_VALUE:
                            return CONFIG_NOT_FOUND_ERROR;
                        default:
                            switch (i2) {
                                case 101:
                                    return API_REQUEST_ERROR;
                                case 102:
                                    return API_RESPONSE_DATA_ERROR;
                                case 103:
                                    return API_RESPONSE_DECODE_ERROR;
                                case 104:
                                    return API_FAILED_STATUS_CODE;
                                case 105:
                                    return INVALID_TEMPLATE_URL;
                                case 106:
                                    return INVALID_REQUEST_BUILDER_ERROR;
                                default:
                                    switch (i2) {
                                        case 109:
                                            return TEMPLATE_UNZIP_ERROR;
                                        case 110:
                                            return INVALID_CTA_URL;
                                        case 111:
                                            return INVALID_ASSET_URL;
                                        case 112:
                                            return ASSET_REQUEST_ERROR;
                                        case 113:
                                            return ASSET_RESPONSE_DATA_ERROR;
                                        case 114:
                                            return ASSET_WRITE_ERROR;
                                        case 115:
                                            return INVALID_INDEX_URL;
                                        case 116:
                                            return GZIP_ENCODE_ERROR;
                                        case ASSET_FAILED_STATUS_CODE_VALUE:
                                            return ASSET_FAILED_STATUS_CODE;
                                        case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                            return PROTOBUF_SERIALIZATION_ERROR;
                                        case JSON_ENCODE_ERROR_VALUE:
                                            return JSON_ENCODE_ERROR;
                                        default:
                                            switch (i2) {
                                                case 200:
                                                    return INVALID_EVENT_ID_ERROR;
                                                case 201:
                                                    return INVALID_PLACEMENT_ID;
                                                case AD_CONSUMED_VALUE:
                                                    return AD_CONSUMED;
                                                case AD_IS_LOADING_VALUE:
                                                    return AD_IS_LOADING;
                                                case 204:
                                                    return AD_ALREADY_LOADED;
                                                case AD_IS_PLAYING_VALUE:
                                                    return AD_IS_PLAYING;
                                                case AD_ALREADY_FAILED_VALUE:
                                                    return AD_ALREADY_FAILED;
                                                case PLACEMENT_AD_TYPE_MISMATCH_VALUE:
                                                    return PLACEMENT_AD_TYPE_MISMATCH;
                                                case INVALID_BID_PAYLOAD_VALUE:
                                                    return INVALID_BID_PAYLOAD;
                                                case INVALID_JSON_BID_PAYLOAD_VALUE:
                                                    return INVALID_JSON_BID_PAYLOAD;
                                                case AD_NOT_LOADED_VALUE:
                                                    return AD_NOT_LOADED;
                                                default:
                                                    switch (i2) {
                                                        case PLACEMENT_SLEEP_VALUE:
                                                            return PLACEMENT_SLEEP;
                                                        case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                                                            return INVALID_ADUNIT_BID_PAYLOAD;
                                                        case INVALID_GZIP_BID_PAYLOAD_VALUE:
                                                            return INVALID_GZIP_BID_PAYLOAD;
                                                        case AD_RESPONSE_EMPTY_VALUE:
                                                            return AD_RESPONSE_EMPTY;
                                                        case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                                            return AD_RESPONSE_INVALID_TEMPLATE_TYPE;
                                                        case AD_RESPONSE_TIMED_OUT_VALUE:
                                                            return AD_RESPONSE_TIMED_OUT;
                                                        case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                                            return MRAID_JS_DOES_NOT_EXIST;
                                                        case MRAID_JS_COPY_FAILED_VALUE:
                                                            return MRAID_JS_COPY_FAILED;
                                                        case AD_RESPONSE_RETRY_AFTER_VALUE:
                                                            return AD_RESPONSE_RETRY_AFTER;
                                                        case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                                                            return AD_LOAD_FAIL_RETRY_AFTER;
                                                        case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                                                            return INVALID_WATERFALL_PLACEMENT_ID;
                                                        case STALE_CACHED_RESPONSE_VALUE:
                                                            return STALE_CACHED_RESPONSE;
                                                        case 224:
                                                            return AD_LOAD_FAIL_EMPTY_BID_PAYLOAD;
                                                        case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                                                            return AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH;
                                                        case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                                            return PRIVACY_ICON_FALLBACK_ERROR;
                                                        default:
                                                            switch (i2) {
                                                                case 307:
                                                                    return AD_EXPIRED_ON_PLAY;
                                                                case 308:
                                                                    return AD_WIN_NOTIFICATION_ERROR;
                                                                case ASSET_FAILED_TO_DELETE_VALUE:
                                                                    return ASSET_FAILED_TO_DELETE;
                                                                case AD_HTML_FAILED_TO_LOAD_VALUE:
                                                                    return AD_HTML_FAILED_TO_LOAD;
                                                                case MRAID_JS_CALL_EMPTY_VALUE:
                                                                    return MRAID_JS_CALL_EMPTY;
                                                                case DEEPLINK_OPEN_FAILED_VALUE:
                                                                    return DEEPLINK_OPEN_FAILED;
                                                                case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                                                    return EVALUATE_JAVASCRIPT_FAILED;
                                                                case LINK_COMMAND_OPEN_FAILED_VALUE:
                                                                    return LINK_COMMAND_OPEN_FAILED;
                                                                case JSON_PARAMS_ENCODE_ERROR_VALUE:
                                                                    return JSON_PARAMS_ENCODE_ERROR;
                                                                case GENERATE_JSON_DATA_ERROR_VALUE:
                                                                    return GENERATE_JSON_DATA_ERROR;
                                                                case AD_CLOSED_TEMPLATE_ERROR_VALUE:
                                                                    return AD_CLOSED_TEMPLATE_ERROR;
                                                                case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                                                                    return AD_CLOSED_MISSING_HEARTBEAT;
                                                                case SILENT_MODE_MONITOR_ERROR_VALUE:
                                                                    return SILENT_MODE_MONITOR_ERROR;
                                                                case WEBVIEW_ERROR_VALUE:
                                                                    return WEBVIEW_ERROR;
                                                                case BLACK_SCREEN_DETECTION_ERROR_VALUE:
                                                                    return BLACK_SCREEN_DETECTION_ERROR;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                return UNKNOWN_ERROR;
            }

            public static nKK.Ml internalGetValueMap() {
                return internalValueMap;
            }

            public static nKK.I28 internalGetVerifier() {
                return ReasonVerifier.INSTANCE;
            }

            @Deprecated
            public static Reason valueOf(int i2) {
                return forNumber(i2);
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            Reason(int i2) {
                this.value = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAdPodding() {
            this.isAdPodding_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAdoEnabled() {
            this.isAdoEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLowDataModeEnabled() {
            this.isLowDataModeEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsPartialDownloadEnabled() {
            this.isPartialDownloadEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReason() {
            this.reason_ = 0;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKError) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            SDKError sDKError = new SDKError();
            DEFAULT_INSTANCE = sDKError;
            g9s.registerDefaultInstance(SDKError.class, sDKError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppState() {
            this.appState_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAt() {
            this.at_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHbPlacement() {
            this.isHbPlacement_ = 0L;
        }

        public static SDKError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SDKError sDKError) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sDKError);
        }

        public static SDKError parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKError) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKError parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
        }

        public static KH parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppState(long j2) {
            this.appState_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAt(long j2) {
            this.at_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAdPodding(boolean z2) {
            this.isAdPodding_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAdoEnabled(boolean z2) {
            this.isAdoEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHbPlacement(long j2) {
            this.isHbPlacement_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLowDataModeEnabled(boolean z2) {
            this.isLowDataModeEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsPartialDownloadEnabled(boolean z2) {
            this.isPartialDownloadEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReasonValue(int i2) {
            this.reason_ = i2;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
                case 1:
                    return new SDKError();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0000\u0001É\u001a\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011\u0002\u0012Ȉ\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018ȈeȈÉ\u0007", new Object[]{"at_", "reason_", "message_", "eventId_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "appState_", "mediationName_", "vmVersion_", "isAdoEnabled_", "isPartialDownloadEnabled_", "isAdPodding_", "adState_", "experiments_", "connectionTypeDetailAndroid_", "isLowDataModeEnabled_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (SDKError.class) {
                        try {
                            w6Var = PARSER;
                            if (w6Var == null) {
                                w6Var = new g9s.w6(DEFAULT_INSTANCE);
                                PARSER = w6Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return w6Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getAdSource() {
            return this.adSource_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getAdSourceBytes() {
            return C.copyFromUtf8(this.adSource_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getAdState() {
            return this.adState_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getAdStateBytes() {
            return C.copyFromUtf8(this.adState_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public long getAppState() {
            return this.appState_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public long getAt() {
            return this.at_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionType() {
            return this.connectionType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getConnectionTypeBytes() {
            return C.copyFromUtf8(this.connectionType_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionTypeDetail() {
            return this.connectionTypeDetail_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getConnectionTypeDetailAndroid() {
            return this.connectionTypeDetailAndroid_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getConnectionTypeDetailAndroidBytes() {
            return C.copyFromUtf8(this.connectionTypeDetailAndroid_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getConnectionTypeDetailBytes() {
            return C.copyFromUtf8(this.connectionTypeDetail_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getCreativeId() {
            return this.creativeId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getCreativeIdBytes() {
            return C.copyFromUtf8(this.creativeId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getEventIdBytes() {
            return C.copyFromUtf8(this.eventId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getExperiments() {
            return this.experiments_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getExperimentsBytes() {
            return C.copyFromUtf8(this.experiments_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public boolean getIsAdPodding() {
            return this.isAdPodding_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public boolean getIsAdoEnabled() {
            return this.isAdoEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public long getIsHbPlacement() {
            return this.isHbPlacement_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public boolean getIsLowDataModeEnabled() {
            return this.isLowDataModeEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public boolean getIsPartialDownloadEnabled() {
            return this.isPartialDownloadEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getMake() {
            return this.make_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getMakeBytes() {
            return C.copyFromUtf8(this.make_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getMediationName() {
            return this.mediationName_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getMediationNameBytes() {
            return C.copyFromUtf8(this.mediationName_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getMessage() {
            return this.message_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getMessageBytes() {
            return C.copyFromUtf8(this.message_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getModelBytes() {
            return C.copyFromUtf8(this.model_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getOsBytes() {
            return C.copyFromUtf8(this.os_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getOsVersionBytes() {
            return C.copyFromUtf8(this.osVersion_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getPlacementReferenceId() {
            return this.placementReferenceId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getPlacementReferenceIdBytes() {
            return C.copyFromUtf8(this.placementReferenceId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getPlacementType() {
            return this.placementType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getPlacementTypeBytes() {
            return C.copyFromUtf8(this.placementType_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public Reason getReason() {
            Reason reasonForNumber = Reason.forNumber(this.reason_);
            return reasonForNumber == null ? Reason.UNRECOGNIZED : reasonForNumber;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public int getReasonValue() {
            return this.reason_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getSessionIdBytes() {
            return C.copyFromUtf8(this.sessionId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public String getVmVersion() {
            return this.vmVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorOrBuilder
        public C getVmVersionBytes() {
            return C.copyFromUtf8(this.vmVersion_);
        }

        private SDKError() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdSource() {
            this.adSource_ = getDefaultInstance().getAdSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdState() {
            this.adState_ = getDefaultInstance().getAdState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetailAndroid() {
            this.connectionTypeDetailAndroid_ = getDefaultInstance().getConnectionTypeDetailAndroid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreativeId() {
            this.creativeId_ = getDefaultInstance().getCreativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperiments() {
            this.experiments_ = getDefaultInstance().getExperiments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationName() {
            this.mediationName_ = getDefaultInstance().getMediationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementReferenceId() {
            this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementType() {
            this.placementType_ = getDefaultInstance().getPlacementType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVmVersion() {
            this.vmVersion_ = getDefaultInstance().getVmVersion();
        }

        public static SDKError parseFrom(C c2) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdSource(String str) {
            str.getClass();
            this.adSource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdSourceBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.adSource_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdState(String str) {
            str.getClass();
            this.adState_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdStateBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.adState_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.connectionType_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetail(String str) {
            str.getClass();
            this.connectionTypeDetail_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailAndroid(String str) {
            str.getClass();
            this.connectionTypeDetailAndroid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailAndroidBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.connectionTypeDetailAndroid_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.connectionTypeDetail_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeId(String str) {
            str.getClass();
            this.creativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.creativeId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.eventId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperiments(String str) {
            str.getClass();
            this.experiments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentsBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.experiments_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.make_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationName(String str) {
            str.getClass();
            this.mediationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationNameBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.mediationName_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.message_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.model_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.os_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.osVersion_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceId(String str) {
            str.getClass();
            this.placementReferenceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.placementReferenceId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementType(String str) {
            str.getClass();
            this.placementType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementTypeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.placementType_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReason(Reason reason) {
            this.reason_ = reason.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.sessionId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVmVersion(String str) {
            str.getClass();
            this.vmVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVmVersionBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.vmVersion_ = c2.toStringUtf8();
        }

        public static SDKError parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
        }

        public static SDKError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKError parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
        }

        public static SDKError parseFrom(InputStream inputStream) throws IOException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKError parseFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKError parseFrom(AbstractC1923o abstractC1923o) throws IOException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
        }

        public static SDKError parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            return (SDKError) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
        }
    }

    public static final class SDKErrorBatch extends g9s implements SDKErrorBatchOrBuilder {
        private static final SDKErrorBatch DEFAULT_INSTANCE;
        public static final int ERRORS_FIELD_NUMBER = 1;
        private static volatile KH PARSER;
        private nKK.Dsr errors_ = g9s.emptyProtobufList();

        public static final class Builder extends g9s.n implements SDKErrorBatchOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addErrors(SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(sDKError);
                return this;
            }

            public Builder setErrors(int i2, SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).setErrors(i2, sDKError);
                return this;
            }

            private Builder() {
                super(SDKErrorBatch.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public SDKError getErrors(int i2) {
                return ((SDKErrorBatch) this.instance).getErrors(i2);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public int getErrorsCount() {
                return ((SDKErrorBatch) this.instance).getErrorsCount();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
            public List<SDKError> getErrorsList() {
                return Collections.unmodifiableList(((SDKErrorBatch) this.instance).getErrorsList());
            }

            public Builder addAllErrors(Iterable<? extends SDKError> iterable) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addAllErrors(iterable);
                return this;
            }

            public Builder addErrors(int i2, SDKError sDKError) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(i2, sDKError);
                return this;
            }

            public Builder clearErrors() {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).clearErrors();
                return this;
            }

            public Builder removeErrors(int i2) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).removeErrors(i2);
                return this;
            }

            public Builder setErrors(int i2, SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).setErrors(i2, (SDKError) builder.build());
                return this;
            }

            public Builder addErrors(SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors((SDKError) builder.build());
                return this;
            }

            public Builder addErrors(int i2, SDKError.Builder builder) {
                copyOnWrite();
                ((SDKErrorBatch) this.instance).addErrors(i2, (SDKError) builder.build());
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addErrors(SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.add(sDKError);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKErrorBatch) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            SDKErrorBatch sDKErrorBatch = new SDKErrorBatch();
            DEFAULT_INSTANCE = sDKErrorBatch;
            g9s.registerDefaultInstance(SDKErrorBatch.class, sDKErrorBatch);
        }

        private void ensureErrorsIsMutable() {
            nKK.Dsr dsr = this.errors_;
            if (dsr.isModifiable()) {
                return;
            }
            this.errors_ = g9s.mutableCopy(dsr);
        }

        public static SDKErrorBatch getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SDKErrorBatch sDKErrorBatch) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sDKErrorBatch);
        }

        public static SDKErrorBatch parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKErrorBatch) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKErrorBatch parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
        }

        public static KH parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
                case 1:
                    return new SDKErrorBatch();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"errors_", SDKError.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (SDKErrorBatch.class) {
                        try {
                            w6Var = PARSER;
                            if (w6Var == null) {
                                w6Var = new g9s.w6(DEFAULT_INSTANCE);
                                PARSER = w6Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return w6Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public SDKError getErrors(int i2) {
            return (SDKError) this.errors_.get(i2);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public int getErrorsCount() {
            return this.errors_.size();
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKErrorBatchOrBuilder
        public List<SDKError> getErrorsList() {
            return this.errors_;
        }

        public SDKErrorOrBuilder getErrorsOrBuilder(int i2) {
            return (SDKErrorOrBuilder) this.errors_.get(i2);
        }

        public List<? extends SDKErrorOrBuilder> getErrorsOrBuilderList() {
            return this.errors_;
        }

        private SDKErrorBatch() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllErrors(Iterable<? extends SDKError> iterable) {
            ensureErrorsIsMutable();
            j.addAll((Iterable) iterable, (List) this.errors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrors() {
            this.errors_ = g9s.emptyProtobufList();
        }

        public static SDKErrorBatch parseFrom(C c2) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeErrors(int i2) {
            ensureErrorsIsMutable();
            this.errors_.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrors(int i2, SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.set(i2, sDKError);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addErrors(int i2, SDKError sDKError) {
            sDKError.getClass();
            ensureErrorsIsMutable();
            this.errors_.add(i2, sDKError);
        }

        public static SDKErrorBatch parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
        }

        public static SDKErrorBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKErrorBatch parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream) throws IOException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKErrorBatch parseFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKErrorBatch parseFrom(AbstractC1923o abstractC1923o) throws IOException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
        }

        public static SDKErrorBatch parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            return (SDKErrorBatch) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
        }
    }

    public interface SDKErrorBatchOrBuilder extends pO {
        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        SDKError getErrors(int i2);

        int getErrorsCount();

        List<SDKError> getErrorsList();

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();
    }

    public interface SDKErrorOrBuilder extends pO {
        String getAdSource();

        C getAdSourceBytes();

        String getAdState();

        C getAdStateBytes();

        long getAppState();

        long getAt();

        String getConnectionType();

        C getConnectionTypeBytes();

        String getConnectionTypeDetail();

        String getConnectionTypeDetailAndroid();

        C getConnectionTypeDetailAndroidBytes();

        C getConnectionTypeDetailBytes();

        String getCreativeId();

        C getCreativeIdBytes();

        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        String getEventId();

        C getEventIdBytes();

        String getExperiments();

        C getExperimentsBytes();

        boolean getIsAdPodding();

        boolean getIsAdoEnabled();

        long getIsHbPlacement();

        boolean getIsLowDataModeEnabled();

        boolean getIsPartialDownloadEnabled();

        String getMake();

        C getMakeBytes();

        String getMediationName();

        C getMediationNameBytes();

        String getMessage();

        C getMessageBytes();

        String getModel();

        C getModelBytes();

        String getOs();

        C getOsBytes();

        String getOsVersion();

        C getOsVersionBytes();

        String getPlacementReferenceId();

        C getPlacementReferenceIdBytes();

        String getPlacementType();

        C getPlacementTypeBytes();

        SDKError.Reason getReason();

        int getReasonValue();

        String getSessionId();

        C getSessionIdBytes();

        String getVmVersion();

        C getVmVersionBytes();

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class SDKMetric extends g9s implements SDKMetricOrBuilder {
        public static final int ADSOURCE_FIELD_NUMBER = 16;
        public static final int ADSTATE_FIELD_NUMBER = 23;
        public static final int APPSTATE_FIELD_NUMBER = 18;
        public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
        public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
        public static final int CREATIVEID_FIELD_NUMBER = 11;
        private static final SDKMetric DEFAULT_INSTANCE;
        public static final int EVENTID_FIELD_NUMBER = 12;
        public static final int EXPERIMENTS_FIELD_NUMBER = 24;
        public static final int ISADOENABLED_FIELD_NUMBER = 20;
        public static final int ISADPODDING_FIELD_NUMBER = 22;
        public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
        public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
        public static final int ISPARTIALDOWNLOADENABLED_FIELD_NUMBER = 21;
        public static final int MAKE_FIELD_NUMBER = 4;
        public static final int MEDIATIONNAME_FIELD_NUMBER = 17;
        public static final int META_FIELD_NUMBER = 3;
        public static final int MODEL_FIELD_NUMBER = 5;
        public static final int OSVERSION_FIELD_NUMBER = 7;
        public static final int OS_FIELD_NUMBER = 6;
        private static volatile KH PARSER = null;
        public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
        public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
        public static final int SESSIONID_FIELD_NUMBER = 13;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int VMVERSION_FIELD_NUMBER = 19;
        private long appState_;
        private boolean isAdPodding_;
        private boolean isAdoEnabled_;
        private long isHbPlacement_;
        private boolean isLowDataModeEnabled_;
        private boolean isPartialDownloadEnabled_;
        private int type_;
        private long value_;
        private String meta_ = "";
        private String make_ = "";
        private String model_ = "";
        private String os_ = "";
        private String osVersion_ = "";
        private String connectionType_ = "";
        private String connectionTypeDetail_ = "";
        private String placementReferenceId_ = "";
        private String creativeId_ = "";
        private String eventId_ = "";
        private String sessionId_ = "";
        private String placementType_ = "";
        private String adSource_ = "";
        private String mediationName_ = "";
        private String vmVersion_ = "";
        private String adState_ = "";
        private String experiments_ = "";

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public static final class Builder extends g9s.n implements SDKMetricOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(SDKMetric.DEFAULT_INSTANCE);
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getAdSource() {
                return ((SDKMetric) this.instance).getAdSource();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getAdSourceBytes() {
                return ((SDKMetric) this.instance).getAdSourceBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getAdState() {
                return ((SDKMetric) this.instance).getAdState();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getAdStateBytes() {
                return ((SDKMetric) this.instance).getAdStateBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public long getAppState() {
                return ((SDKMetric) this.instance).getAppState();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getConnectionType() {
                return ((SDKMetric) this.instance).getConnectionType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getConnectionTypeBytes() {
                return ((SDKMetric) this.instance).getConnectionTypeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getConnectionTypeDetail() {
                return ((SDKMetric) this.instance).getConnectionTypeDetail();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getConnectionTypeDetailBytes() {
                return ((SDKMetric) this.instance).getConnectionTypeDetailBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getCreativeId() {
                return ((SDKMetric) this.instance).getCreativeId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getCreativeIdBytes() {
                return ((SDKMetric) this.instance).getCreativeIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getEventId() {
                return ((SDKMetric) this.instance).getEventId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getEventIdBytes() {
                return ((SDKMetric) this.instance).getEventIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getExperiments() {
                return ((SDKMetric) this.instance).getExperiments();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getExperimentsBytes() {
                return ((SDKMetric) this.instance).getExperimentsBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public boolean getIsAdPodding() {
                return ((SDKMetric) this.instance).getIsAdPodding();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public boolean getIsAdoEnabled() {
                return ((SDKMetric) this.instance).getIsAdoEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public long getIsHbPlacement() {
                return ((SDKMetric) this.instance).getIsHbPlacement();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public boolean getIsLowDataModeEnabled() {
                return ((SDKMetric) this.instance).getIsLowDataModeEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public boolean getIsPartialDownloadEnabled() {
                return ((SDKMetric) this.instance).getIsPartialDownloadEnabled();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getMake() {
                return ((SDKMetric) this.instance).getMake();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getMakeBytes() {
                return ((SDKMetric) this.instance).getMakeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getMediationName() {
                return ((SDKMetric) this.instance).getMediationName();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getMediationNameBytes() {
                return ((SDKMetric) this.instance).getMediationNameBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getMeta() {
                return ((SDKMetric) this.instance).getMeta();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getMetaBytes() {
                return ((SDKMetric) this.instance).getMetaBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getModel() {
                return ((SDKMetric) this.instance).getModel();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getModelBytes() {
                return ((SDKMetric) this.instance).getModelBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getOs() {
                return ((SDKMetric) this.instance).getOs();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getOsBytes() {
                return ((SDKMetric) this.instance).getOsBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getOsVersion() {
                return ((SDKMetric) this.instance).getOsVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getOsVersionBytes() {
                return ((SDKMetric) this.instance).getOsVersionBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getPlacementReferenceId() {
                return ((SDKMetric) this.instance).getPlacementReferenceId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getPlacementReferenceIdBytes() {
                return ((SDKMetric) this.instance).getPlacementReferenceIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getPlacementType() {
                return ((SDKMetric) this.instance).getPlacementType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getPlacementTypeBytes() {
                return ((SDKMetric) this.instance).getPlacementTypeBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getSessionId() {
                return ((SDKMetric) this.instance).getSessionId();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getSessionIdBytes() {
                return ((SDKMetric) this.instance).getSessionIdBytes();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public SDKMetricType getType() {
                return ((SDKMetric) this.instance).getType();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public int getTypeValue() {
                return ((SDKMetric) this.instance).getTypeValue();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public long getValue() {
                return ((SDKMetric) this.instance).getValue();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public String getVmVersion() {
                return ((SDKMetric) this.instance).getVmVersion();
            }

            @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
            public C getVmVersionBytes() {
                return ((SDKMetric) this.instance).getVmVersionBytes();
            }

            public Builder clearAdSource() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearAdSource();
                return this;
            }

            public Builder clearAdState() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearAdState();
                return this;
            }

            public Builder clearAppState() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearAppState();
                return this;
            }

            public Builder clearConnectionType() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearConnectionType();
                return this;
            }

            public Builder clearConnectionTypeDetail() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearConnectionTypeDetail();
                return this;
            }

            public Builder clearCreativeId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearCreativeId();
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearEventId();
                return this;
            }

            public Builder clearExperiments() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearExperiments();
                return this;
            }

            public Builder clearIsAdPodding() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearIsAdPodding();
                return this;
            }

            public Builder clearIsAdoEnabled() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearIsAdoEnabled();
                return this;
            }

            public Builder clearIsHbPlacement() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearIsHbPlacement();
                return this;
            }

            public Builder clearIsLowDataModeEnabled() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearIsLowDataModeEnabled();
                return this;
            }

            public Builder clearIsPartialDownloadEnabled() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearIsPartialDownloadEnabled();
                return this;
            }

            public Builder clearMake() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearMake();
                return this;
            }

            public Builder clearMediationName() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearMediationName();
                return this;
            }

            public Builder clearMeta() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearMeta();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearModel();
                return this;
            }

            public Builder clearOs() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearOs();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearPlacementReferenceId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearPlacementReferenceId();
                return this;
            }

            public Builder clearPlacementType() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearPlacementType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearSessionId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearValue();
                return this;
            }

            public Builder clearVmVersion() {
                copyOnWrite();
                ((SDKMetric) this.instance).clearVmVersion();
                return this;
            }

            public Builder setAdSource(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setAdSource(str);
                return this;
            }

            public Builder setAdSourceBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setAdSourceBytes(c2);
                return this;
            }

            public Builder setAdState(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setAdState(str);
                return this;
            }

            public Builder setAdStateBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setAdStateBytes(c2);
                return this;
            }

            public Builder setAppState(long j2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setAppState(j2);
                return this;
            }

            public Builder setConnectionType(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionType(str);
                return this;
            }

            public Builder setConnectionTypeBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeBytes(c2);
                return this;
            }

            public Builder setConnectionTypeDetail(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeDetail(str);
                return this;
            }

            public Builder setConnectionTypeDetailBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setConnectionTypeDetailBytes(c2);
                return this;
            }

            public Builder setCreativeId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setCreativeId(str);
                return this;
            }

            public Builder setCreativeIdBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setCreativeIdBytes(c2);
                return this;
            }

            public Builder setEventId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setEventId(str);
                return this;
            }

            public Builder setEventIdBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setEventIdBytes(c2);
                return this;
            }

            public Builder setExperiments(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setExperiments(str);
                return this;
            }

            public Builder setExperimentsBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setExperimentsBytes(c2);
                return this;
            }

            public Builder setIsAdPodding(boolean z2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setIsAdPodding(z2);
                return this;
            }

            public Builder setIsAdoEnabled(boolean z2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setIsAdoEnabled(z2);
                return this;
            }

            public Builder setIsHbPlacement(long j2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setIsHbPlacement(j2);
                return this;
            }

            public Builder setIsLowDataModeEnabled(boolean z2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setIsLowDataModeEnabled(z2);
                return this;
            }

            public Builder setIsPartialDownloadEnabled(boolean z2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setIsPartialDownloadEnabled(z2);
                return this;
            }

            public Builder setMake(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMake(str);
                return this;
            }

            public Builder setMakeBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMakeBytes(c2);
                return this;
            }

            public Builder setMediationName(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMediationName(str);
                return this;
            }

            public Builder setMediationNameBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMediationNameBytes(c2);
                return this;
            }

            public Builder setMeta(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMeta(str);
                return this;
            }

            public Builder setMetaBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setMetaBytes(c2);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setModelBytes(c2);
                return this;
            }

            public Builder setOs(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOs(str);
                return this;
            }

            public Builder setOsBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsBytes(c2);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setOsVersionBytes(c2);
                return this;
            }

            public Builder setPlacementReferenceId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementReferenceId(str);
                return this;
            }

            public Builder setPlacementReferenceIdBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementReferenceIdBytes(c2);
                return this;
            }

            public Builder setPlacementType(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementType(str);
                return this;
            }

            public Builder setPlacementTypeBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setPlacementTypeBytes(c2);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setSessionIdBytes(c2);
                return this;
            }

            public Builder setType(SDKMetricType sDKMetricType) {
                copyOnWrite();
                ((SDKMetric) this.instance).setType(sDKMetricType);
                return this;
            }

            public Builder setTypeValue(int i2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setTypeValue(i2);
                return this;
            }

            public Builder setValue(long j2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setValue(j2);
                return this;
            }

            public Builder setVmVersion(String str) {
                copyOnWrite();
                ((SDKMetric) this.instance).setVmVersion(str);
                return this;
            }

            public Builder setVmVersionBytes(C c2) {
                copyOnWrite();
                ((SDKMetric) this.instance).setVmVersionBytes(c2);
                return this;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public enum SDKMetricType implements nKK.w6 {
            UNKNOWN_METRIC_TYPE(0),
            AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
            AD_RESPONSE_TO_SHOW_DURATION_MS(2),
            AD_SHOW_TO_DISPLAY_DURATION_MS(3),
            AD_DISPLAY_TO_CLICK_DURATION_MS(4),
            IOS_STORE_KIT_LOAD_TIME_MS(5),
            INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
            ASSET_DOWNLOAD_DURATION_MS(7),
            LOCAL_ASSETS_USED(8),
            REMOTE_ASSETS_USED(9),
            TEMPLATE_DOWNLOAD_DURATION_MS(10),
            AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
            AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
            ASSET_FILE_SIZE(13),
            USER_AGENT_LOAD_DURATION_MS(14),
            TEMPLATE_ZIP_SIZE(15),
            CACHED_ASSETS_USED(16),
            LOAD_AD_API(17),
            TPAT_FIRED(18),
            TPAT_SUCCESS(19),
            WIN_NOTIF_FIRED(20),
            WIN_NOTIF_SUCCESS(21),
            AD_EXPIRED_BEFORE_PLAY(22),
            PLAY_AD_API(23),
            AD_LOAD_FAIL(24),
            VIEW_NOT_VISIBLE_ON_PLAY(25),
            MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
            OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
            PRIVACY_URL_OPENED(28),
            NOTIFICATION_REDIRECT(29),
            AD_PLAY_RESET_ON_DEINIT(30),
            TEMPLATE_HTML_SIZE(31),
            CONFIG_LOADED_FROM_INIT(32),
            CONFIG_LOADED_FROM_AD_LOAD(33),
            CONFIG_LOADED_FROM_ADM_LOAD(34),
            AD_SHOW_TO_PRESENT_DURATION_MS(35),
            AD_SHOW_TO_FAIL_DURATION_MS(36),
            AD_PRESENT_TO_DISPLAY_DURATION_MS(37),
            BID_TOKEN_REQUESTED(38),
            BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS(39),
            BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS(40),
            AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS(41),
            AD_SHOW_TO_CLOSE_DURATION_MS(42),
            AD_LOAD_TO_CALLBACK_DURATION_MS(43),
            AD_LOAD_TO_CALLBACK_ADO_DURATION_MS(44),
            SDK_INIT_API(45),
            AD_START_EVENT(46),
            AD_CLICK_EVENT(47),
            AD_SHOW_TO_VALIDATION_DURATION_MS(48),
            AD_VALIDATION_TO_PRESENT_DURATION_MS(49),
            AD_LEAVE_APPLICATION(50),
            AD_REWARD_USER(51),
            AD_REQUIRED_DOWNLOAD_DURATION_MS(52),
            AD_OPTIONAL_DOWNLOAD_DURATION_MS(53),
            AD_BACKGROUND_BEFORE_IMPRESSION(54),
            AD_CLOSED_BEFORE_IMPRESSION(55),
            AD_VISIBILITY(56),
            INIT_TO_SUCCESS_CALLBACK_DURATION_MS(57),
            INIT_TO_FAIL_CALLBACK_DURATION_MS(58),
            AD_START_TO_BACKGROUND_DURATION_MS(59),
            ASSET_PARTIAL_DOWNLOAD_DURATION_MS(60),
            APP_BACKGROUND_DURING_AD_LOAD(61),
            DEPRECATED_API_USED(62),
            AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET(63),
            AD_PRELOAD_TO_READY_DURATION_MS(64),
            CONCURRENT_CACHED_WEBVIEW_COUNT(65),
            BLACK_SCREEN_IS_DETECTED(66),
            NATIVE_PLAY_ASSET_TYPE(67),
            NATIVE_VIDEO_PREPARE_DURATION_MS(68),
            NATIVE_AD_DISPLAY_DURATION(69),
            ASSET_DOWNLOAD_RETRY_STATUS(70),
            SKOVERLAY_PRESENTED_FOR_AD(2000),
            SAFARI_PRESENTED_FOR_AD(2001),
            STORE_KIT_PRESENTED_FOR_AD(2002),
            STORE_KIT_NOT_READY(2003),
            LAUNCH_STORE_KIT_REQUEST(2004),
            LAUNCH_SKOVERLAY_REQUEST(2005),
            LAUNCH_SAFARI_REQUEST(2006),
            IDFV_RESTRICTED(2007),
            NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
            IDFV_VALUE_CHANGED(2009),
            AD_WILL_CLOSE(2010),
            APP_TERM_DURING_AD_BEFORE_IMPRESSION(2011),
            HANDLE_TAP_REQUEST(2012),
            HANDLE_TAP_SUCCESS(2013),
            HARDWARE_ACCELERATE_DISABLED(3001),
            BANNER_AUTO_REDIRECT(3002),
            BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL(3003),
            INLINE_INSTALL_STATUS(3004),
            UNRECOGNIZED(-1);

            public static final int AD_BACKGROUND_BEFORE_IMPRESSION_VALUE = 54;
            public static final int AD_CLICK_EVENT_VALUE = 47;
            public static final int AD_CLOSED_BEFORE_IMPRESSION_VALUE = 55;
            public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

            @Deprecated
            public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
            public static final int AD_LEAVE_APPLICATION_VALUE = 50;
            public static final int AD_LOAD_FAIL_VALUE = 24;
            public static final int AD_LOAD_TO_CALLBACK_ADO_DURATION_MS_VALUE = 44;
            public static final int AD_LOAD_TO_CALLBACK_DURATION_MS_VALUE = 43;
            public static final int AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 41;
            public static final int AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE = 53;
            public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
            public static final int AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE = 63;
            public static final int AD_PRELOAD_TO_READY_DURATION_MS_VALUE = 64;
            public static final int AD_PRESENT_TO_DISPLAY_DURATION_MS_VALUE = 37;
            public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
            public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
            public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
            public static final int AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE = 52;
            public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
            public static final int AD_REWARD_USER_VALUE = 51;
            public static final int AD_SHOW_TO_CLOSE_DURATION_MS_VALUE = 42;
            public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
            public static final int AD_SHOW_TO_FAIL_DURATION_MS_VALUE = 36;

            @Deprecated
            public static final int AD_SHOW_TO_PRESENT_DURATION_MS_VALUE = 35;
            public static final int AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE = 48;
            public static final int AD_START_EVENT_VALUE = 46;
            public static final int AD_START_TO_BACKGROUND_DURATION_MS_VALUE = 59;
            public static final int AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE = 49;
            public static final int AD_VISIBILITY_VALUE = 56;
            public static final int AD_WILL_CLOSE_VALUE = 2010;
            public static final int APP_BACKGROUND_DURING_AD_LOAD_VALUE = 61;
            public static final int APP_TERM_DURING_AD_BEFORE_IMPRESSION_VALUE = 2011;
            public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
            public static final int ASSET_DOWNLOAD_RETRY_STATUS_VALUE = 70;
            public static final int ASSET_FILE_SIZE_VALUE = 13;
            public static final int ASSET_PARTIAL_DOWNLOAD_DURATION_MS_VALUE = 60;
            public static final int BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE = 3003;
            public static final int BANNER_AUTO_REDIRECT_VALUE = 3002;
            public static final int BID_TOKEN_REQUESTED_VALUE = 38;
            public static final int BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS_VALUE = 40;
            public static final int BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 39;
            public static final int BLACK_SCREEN_IS_DETECTED_VALUE = 66;
            public static final int CACHED_ASSETS_USED_VALUE = 16;
            public static final int CONCURRENT_CACHED_WEBVIEW_COUNT_VALUE = 65;
            public static final int CONFIG_LOADED_FROM_ADM_LOAD_VALUE = 34;
            public static final int CONFIG_LOADED_FROM_AD_LOAD_VALUE = 33;
            public static final int CONFIG_LOADED_FROM_INIT_VALUE = 32;
            public static final int DEPRECATED_API_USED_VALUE = 62;
            public static final int HANDLE_TAP_REQUEST_VALUE = 2012;
            public static final int HANDLE_TAP_SUCCESS_VALUE = 2013;
            public static final int HARDWARE_ACCELERATE_DISABLED_VALUE = 3001;
            public static final int IDFV_RESTRICTED_VALUE = 2007;
            public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
            public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
            public static final int INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE = 58;
            public static final int INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE = 57;
            public static final int INLINE_INSTALL_STATUS_VALUE = 3004;
            public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
            public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
            public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
            public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
            public static final int LOAD_AD_API_VALUE = 17;

            @Deprecated
            public static final int LOCAL_ASSETS_USED_VALUE = 8;
            public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
            public static final int NATIVE_AD_DISPLAY_DURATION_VALUE = 69;
            public static final int NATIVE_PLAY_ASSET_TYPE_VALUE = 67;
            public static final int NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE = 68;
            public static final int NOTIFICATION_REDIRECT_VALUE = 29;
            public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
            public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
            public static final int PLAY_AD_API_VALUE = 23;
            public static final int PRIVACY_URL_OPENED_VALUE = 28;

            @Deprecated
            public static final int REMOTE_ASSETS_USED_VALUE = 9;
            public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
            public static final int SDK_INIT_API_VALUE = 45;
            public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
            public static final int STORE_KIT_NOT_READY_VALUE = 2003;
            public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
            public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
            public static final int TEMPLATE_HTML_SIZE_VALUE = 31;
            public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
            public static final int TPAT_FIRED_VALUE = 18;
            public static final int TPAT_SUCCESS_VALUE = 19;
            public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
            public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;

            @Deprecated
            public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
            public static final int WIN_NOTIF_FIRED_VALUE = 20;
            public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
            private static final nKK.Ml internalValueMap = new nKK.Ml() { // from class: com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.1
                @Override // com.google.protobuf.nKK.Ml
                public SDKMetricType findValueByNumber(int i2) {
                    return SDKMetricType.forNumber(i2);
                }
            };
            private final int value;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            private static final class SDKMetricTypeVerifier implements nKK.I28 {
                static final nKK.I28 INSTANCE = new SDKMetricTypeVerifier();

                private SDKMetricTypeVerifier() {
                }

                @Override // com.google.protobuf.nKK.I28
                public boolean isInRange(int i2) {
                    if (SDKMetricType.forNumber(i2) != null) {
                        return true;
                    }
                    return false;
                }
            }

            public static nKK.Ml internalGetValueMap() {
                return internalValueMap;
            }

            public static nKK.I28 internalGetVerifier() {
                return SDKMetricTypeVerifier.INSTANCE;
            }

            @Deprecated
            public static SDKMetricType valueOf(int i2) {
                return forNumber(i2);
            }

            @Override // com.google.protobuf.nKK.w6
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            SDKMetricType(int i2) {
                this.value = i2;
            }

            public static SDKMetricType forNumber(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN_METRIC_TYPE;
                    case 1:
                        return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                    case 2:
                        return AD_RESPONSE_TO_SHOW_DURATION_MS;
                    case 3:
                        return AD_SHOW_TO_DISPLAY_DURATION_MS;
                    case 4:
                        return AD_DISPLAY_TO_CLICK_DURATION_MS;
                    case 5:
                        return IOS_STORE_KIT_LOAD_TIME_MS;
                    case 6:
                        return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                    case 7:
                        return ASSET_DOWNLOAD_DURATION_MS;
                    case 8:
                        return LOCAL_ASSETS_USED;
                    case 9:
                        return REMOTE_ASSETS_USED;
                    case 10:
                        return TEMPLATE_DOWNLOAD_DURATION_MS;
                    case 11:
                        return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                    case 12:
                        return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                    case 13:
                        return ASSET_FILE_SIZE;
                    case 14:
                        return USER_AGENT_LOAD_DURATION_MS;
                    case 15:
                        return TEMPLATE_ZIP_SIZE;
                    case 16:
                        return CACHED_ASSETS_USED;
                    case 17:
                        return LOAD_AD_API;
                    case 18:
                        return TPAT_FIRED;
                    case 19:
                        return TPAT_SUCCESS;
                    case 20:
                        return WIN_NOTIF_FIRED;
                    case 21:
                        return WIN_NOTIF_SUCCESS;
                    case 22:
                        return AD_EXPIRED_BEFORE_PLAY;
                    case 23:
                        return PLAY_AD_API;
                    case 24:
                        return AD_LOAD_FAIL;
                    case 25:
                        return VIEW_NOT_VISIBLE_ON_PLAY;
                    case 26:
                        return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                    case 27:
                        return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                    case 28:
                        return PRIVACY_URL_OPENED;
                    case 29:
                        return NOTIFICATION_REDIRECT;
                    case 30:
                        return AD_PLAY_RESET_ON_DEINIT;
                    case 31:
                        return TEMPLATE_HTML_SIZE;
                    case 32:
                        return CONFIG_LOADED_FROM_INIT;
                    case 33:
                        return CONFIG_LOADED_FROM_AD_LOAD;
                    case 34:
                        return CONFIG_LOADED_FROM_ADM_LOAD;
                    case 35:
                        return AD_SHOW_TO_PRESENT_DURATION_MS;
                    case 36:
                        return AD_SHOW_TO_FAIL_DURATION_MS;
                    case 37:
                        return AD_PRESENT_TO_DISPLAY_DURATION_MS;
                    case 38:
                        return BID_TOKEN_REQUESTED;
                    case 39:
                        return BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS;
                    case 40:
                        return BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS;
                    case 41:
                        return AD_LOAD_TO_FAIL_CALLBACK_DURATION_MS;
                    case 42:
                        return AD_SHOW_TO_CLOSE_DURATION_MS;
                    case 43:
                        return AD_LOAD_TO_CALLBACK_DURATION_MS;
                    case 44:
                        return AD_LOAD_TO_CALLBACK_ADO_DURATION_MS;
                    case 45:
                        return SDK_INIT_API;
                    case 46:
                        return AD_START_EVENT;
                    case 47:
                        return AD_CLICK_EVENT;
                    case 48:
                        return AD_SHOW_TO_VALIDATION_DURATION_MS;
                    case 49:
                        return AD_VALIDATION_TO_PRESENT_DURATION_MS;
                    case 50:
                        return AD_LEAVE_APPLICATION;
                    case 51:
                        return AD_REWARD_USER;
                    case 52:
                        return AD_REQUIRED_DOWNLOAD_DURATION_MS;
                    case 53:
                        return AD_OPTIONAL_DOWNLOAD_DURATION_MS;
                    case 54:
                        return AD_BACKGROUND_BEFORE_IMPRESSION;
                    case 55:
                        return AD_CLOSED_BEFORE_IMPRESSION;
                    case 56:
                        return AD_VISIBILITY;
                    case 57:
                        return INIT_TO_SUCCESS_CALLBACK_DURATION_MS;
                    case 58:
                        return INIT_TO_FAIL_CALLBACK_DURATION_MS;
                    case 59:
                        return AD_START_TO_BACKGROUND_DURATION_MS;
                    case 60:
                        return ASSET_PARTIAL_DOWNLOAD_DURATION_MS;
                    case 61:
                        return APP_BACKGROUND_DURING_AD_LOAD;
                    case 62:
                        return DEPRECATED_API_USED;
                    case 63:
                        return AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
                    case 64:
                        return AD_PRELOAD_TO_READY_DURATION_MS;
                    case 65:
                        return CONCURRENT_CACHED_WEBVIEW_COUNT;
                    case 66:
                        return BLACK_SCREEN_IS_DETECTED;
                    case 67:
                        return NATIVE_PLAY_ASSET_TYPE;
                    case 68:
                        return NATIVE_VIDEO_PREPARE_DURATION_MS;
                    case 69:
                        return NATIVE_AD_DISPLAY_DURATION;
                    case 70:
                        return ASSET_DOWNLOAD_RETRY_STATUS;
                    default:
                        switch (i2) {
                            case 2000:
                                return SKOVERLAY_PRESENTED_FOR_AD;
                            case 2001:
                                return SAFARI_PRESENTED_FOR_AD;
                            case 2002:
                                return STORE_KIT_PRESENTED_FOR_AD;
                            case 2003:
                                return STORE_KIT_NOT_READY;
                            case 2004:
                                return LAUNCH_STORE_KIT_REQUEST;
                            case 2005:
                                return LAUNCH_SKOVERLAY_REQUEST;
                            case 2006:
                                return LAUNCH_SAFARI_REQUEST;
                            case 2007:
                                return IDFV_RESTRICTED;
                            case 2008:
                                return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                            case 2009:
                                return IDFV_VALUE_CHANGED;
                            case 2010:
                                return AD_WILL_CLOSE;
                            case 2011:
                                return APP_TERM_DURING_AD_BEFORE_IMPRESSION;
                            case 2012:
                                return HANDLE_TAP_REQUEST;
                            case 2013:
                                return HANDLE_TAP_SUCCESS;
                            default:
                                switch (i2) {
                                    case 3001:
                                        return HARDWARE_ACCELERATE_DISABLED;
                                    case 3002:
                                        return BANNER_AUTO_REDIRECT;
                                    case 3003:
                                        return BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL;
                                    case 3004:
                                        return INLINE_INSTALL_STATUS;
                                    default:
                                        return null;
                                }
                        }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAdPodding() {
            this.isAdPodding_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsAdoEnabled() {
            this.isAdoEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsLowDataModeEnabled() {
            this.isLowDataModeEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsPartialDownloadEnabled() {
            this.isPartialDownloadEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SDKMetric) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            SDKMetric sDKMetric = new SDKMetric();
            DEFAULT_INSTANCE = sDKMetric;
            g9s.registerDefaultInstance(SDKMetric.class, sDKMetric);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppState() {
            this.appState_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsHbPlacement() {
            this.isHbPlacement_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0L;
        }

        public static SDKMetric getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SDKMetric sDKMetric) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sDKMetric);
        }

        public static SDKMetric parseDelimitedFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKMetric) g9s.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKMetric parseFrom(ByteBuffer byteBuffer, QJ qj) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, byteBuffer, qj);
        }

        public static KH parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppState(long j2) {
            this.appState_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAdPodding(boolean z2) {
            this.isAdPodding_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsAdoEnabled(boolean z2) {
            this.isAdoEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsHbPlacement(long j2) {
            this.isHbPlacement_ = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsLowDataModeEnabled(boolean z2) {
            this.isLowDataModeEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsPartialDownloadEnabled(boolean z2) {
            this.isPartialDownloadEnabled_ = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i2) {
            this.type_ = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(long j2) {
            this.value_ = j2;
        }

        @Override // com.google.protobuf.g9s
        protected final Object dynamicMethod(g9s.fuX fux, Object obj, Object obj2) {
            KH w6Var;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fux.ordinal()]) {
                case 1:
                    return new SDKMetric();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return g9s.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001É\u0019\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0002\u0013Ȉ\u0014\u0007\u0015\u0007\u0016\u0007\u0017Ȉ\u0018ȈÉ\u0007", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "mediationName_", "appState_", "vmVersion_", "isAdoEnabled_", "isPartialDownloadEnabled_", "isAdPodding_", "adState_", "experiments_", inFlMLxL.WjZWNRvwUcVL});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    KH kh = PARSER;
                    if (kh != null) {
                        return kh;
                    }
                    synchronized (SDKMetric.class) {
                        try {
                            w6Var = PARSER;
                            if (w6Var == null) {
                                w6Var = new g9s.w6(DEFAULT_INSTANCE);
                                PARSER = w6Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return w6Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getAdSource() {
            return this.adSource_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getAdSourceBytes() {
            return C.copyFromUtf8(this.adSource_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getAdState() {
            return this.adState_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getAdStateBytes() {
            return C.copyFromUtf8(this.adState_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public long getAppState() {
            return this.appState_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getConnectionType() {
            return this.connectionType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getConnectionTypeBytes() {
            return C.copyFromUtf8(this.connectionType_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getConnectionTypeDetail() {
            return this.connectionTypeDetail_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getConnectionTypeDetailBytes() {
            return C.copyFromUtf8(this.connectionTypeDetail_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getCreativeId() {
            return this.creativeId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getCreativeIdBytes() {
            return C.copyFromUtf8(this.creativeId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getEventId() {
            return this.eventId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getEventIdBytes() {
            return C.copyFromUtf8(this.eventId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getExperiments() {
            return this.experiments_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getExperimentsBytes() {
            return C.copyFromUtf8(this.experiments_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public boolean getIsAdPodding() {
            return this.isAdPodding_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public boolean getIsAdoEnabled() {
            return this.isAdoEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public long getIsHbPlacement() {
            return this.isHbPlacement_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public boolean getIsLowDataModeEnabled() {
            return this.isLowDataModeEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public boolean getIsPartialDownloadEnabled() {
            return this.isPartialDownloadEnabled_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getMake() {
            return this.make_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getMakeBytes() {
            return C.copyFromUtf8(this.make_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getMediationName() {
            return this.mediationName_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getMediationNameBytes() {
            return C.copyFromUtf8(this.mediationName_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getMeta() {
            return this.meta_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getMetaBytes() {
            return C.copyFromUtf8(this.meta_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getModelBytes() {
            return C.copyFromUtf8(this.model_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getOs() {
            return this.os_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getOsBytes() {
            return C.copyFromUtf8(this.os_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getOsVersion() {
            return this.osVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getOsVersionBytes() {
            return C.copyFromUtf8(this.osVersion_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getPlacementReferenceId() {
            return this.placementReferenceId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getPlacementReferenceIdBytes() {
            return C.copyFromUtf8(this.placementReferenceId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getPlacementType() {
            return this.placementType_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getPlacementTypeBytes() {
            return C.copyFromUtf8(this.placementType_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getSessionId() {
            return this.sessionId_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getSessionIdBytes() {
            return C.copyFromUtf8(this.sessionId_);
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public SDKMetricType getType() {
            SDKMetricType sDKMetricTypeForNumber = SDKMetricType.forNumber(this.type_);
            return sDKMetricTypeForNumber == null ? SDKMetricType.UNRECOGNIZED : sDKMetricTypeForNumber;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public long getValue() {
            return this.value_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public String getVmVersion() {
            return this.vmVersion_;
        }

        @Override // com.vungle.ads.internal.protos.Sdk.SDKMetricOrBuilder
        public C getVmVersionBytes() {
            return C.copyFromUtf8(this.vmVersion_);
        }

        private SDKMetric() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdSource() {
            this.adSource_ = getDefaultInstance().getAdSource();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdState() {
            this.adState_ = getDefaultInstance().getAdState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionType() {
            this.connectionType_ = getDefaultInstance().getConnectionType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConnectionTypeDetail() {
            this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreativeId() {
            this.creativeId_ = getDefaultInstance().getCreativeId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExperiments() {
            this.experiments_ = getDefaultInstance().getExperiments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMake() {
            this.make_ = getDefaultInstance().getMake();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationName() {
            this.mediationName_ = getDefaultInstance().getMediationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeta() {
            this.meta_ = getDefaultInstance().getMeta();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOs() {
            this.os_ = getDefaultInstance().getOs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementReferenceId() {
            this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementType() {
            this.placementType_ = getDefaultInstance().getPlacementType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVmVersion() {
            this.vmVersion_ = getDefaultInstance().getVmVersion();
        }

        public static SDKMetric parseFrom(C c2) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, c2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdSource(String str) {
            str.getClass();
            this.adSource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdSourceBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.adSource_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdState(String str) {
            str.getClass();
            this.adState_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdStateBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.adState_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(String str) {
            str.getClass();
            this.connectionType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.connectionType_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetail(String str) {
            str.getClass();
            this.connectionTypeDetail_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeDetailBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.connectionTypeDetail_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeId(String str) {
            str.getClass();
            this.creativeId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreativeIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.creativeId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventId(String str) {
            str.getClass();
            this.eventId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.eventId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperiments(String str) {
            str.getClass();
            this.experiments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExperimentsBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.experiments_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMake(String str) {
            str.getClass();
            this.make_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMakeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.make_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationName(String str) {
            str.getClass();
            this.mediationName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationNameBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.mediationName_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeta(String str) {
            str.getClass();
            this.meta_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetaBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.meta_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.model_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOs(String str) {
            str.getClass();
            this.os_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.os_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOsVersionBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.osVersion_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceId(String str) {
            str.getClass();
            this.placementReferenceId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementReferenceIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.placementReferenceId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementType(String str) {
            str.getClass();
            this.placementType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementTypeBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.placementType_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionIdBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.sessionId_ = c2.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(SDKMetricType sDKMetricType) {
            this.type_ = sDKMetricType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVmVersion(String str) {
            str.getClass();
            this.vmVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVmVersionBytes(C c2) {
            j.checkByteStringIsUtf8(c2);
            this.vmVersion_ = c2.toStringUtf8();
        }

        public static SDKMetric parseFrom(C c2, QJ qj) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, c2, qj);
        }

        public static SDKMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKMetric parseFrom(byte[] bArr, QJ qj) throws InvalidProtocolBufferException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, bArr, qj);
        }

        public static SDKMetric parseFrom(InputStream inputStream) throws IOException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKMetric parseFrom(InputStream inputStream, QJ qj) throws IOException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, inputStream, qj);
        }

        public static SDKMetric parseFrom(AbstractC1923o abstractC1923o) throws IOException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o);
        }

        public static SDKMetric parseFrom(AbstractC1923o abstractC1923o, QJ qj) throws IOException {
            return (SDKMetric) g9s.parseFrom(DEFAULT_INSTANCE, abstractC1923o, qj);
        }
    }

    public interface SDKMetricOrBuilder extends pO {
        String getAdSource();

        C getAdSourceBytes();

        String getAdState();

        C getAdStateBytes();

        long getAppState();

        String getConnectionType();

        C getConnectionTypeBytes();

        String getConnectionTypeDetail();

        C getConnectionTypeDetailBytes();

        String getCreativeId();

        C getCreativeIdBytes();

        @Override // com.google.protobuf.pO
        /* synthetic */ yg getDefaultInstanceForType();

        String getEventId();

        C getEventIdBytes();

        String getExperiments();

        C getExperimentsBytes();

        boolean getIsAdPodding();

        boolean getIsAdoEnabled();

        long getIsHbPlacement();

        boolean getIsLowDataModeEnabled();

        boolean getIsPartialDownloadEnabled();

        String getMake();

        C getMakeBytes();

        String getMediationName();

        C getMediationNameBytes();

        String getMeta();

        C getMetaBytes();

        String getModel();

        C getModelBytes();

        String getOs();

        C getOsBytes();

        String getOsVersion();

        C getOsVersionBytes();

        String getPlacementReferenceId();

        C getPlacementReferenceIdBytes();

        String getPlacementType();

        C getPlacementTypeBytes();

        String getSessionId();

        C getSessionIdBytes();

        SDKMetric.SDKMetricType getType();

        int getTypeValue();

        long getValue();

        String getVmVersion();

        C getVmVersionBytes();

        @Override // com.google.protobuf.pO
        /* synthetic */ boolean isInitialized();
    }

    public static void registerAllExtensions(QJ qj) {
    }

    /* JADX INFO: renamed from: com.vungle.ads.internal.protos.Sdk$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[g9s.fuX.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[g9s.fuX.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[g9s.fuX.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private Sdk() {
    }
}
