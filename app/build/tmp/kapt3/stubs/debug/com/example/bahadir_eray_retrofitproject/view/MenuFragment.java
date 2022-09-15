package com.example.bahadir_eray_retrofitproject.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000fH\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/bahadir_eray_retrofitproject/view/MenuFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter$Listener;", "()V", "_binding", "Lcom/example/bahadir_eray_retrofitproject/databinding/FragmentMenuBinding;", "binding", "getBinding", "()Lcom/example/bahadir_eray_retrofitproject/databinding/FragmentMenuBinding;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "marsAPIService", "Lcom/example/bahadir_eray_retrofitproject/service/MarsAPIService;", "marsModel", "Ljava/util/ArrayList;", "Lcom/example/bahadir_eray_retrofitproject/model/MarsModel;", "Lkotlin/collections/ArrayList;", "recyclerViewAdapter", "Lcom/example/bahadir_eray_retrofitproject/adapter/RecyclerViewAdapter;", "getDataFromAPI", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onItemClick", "onViewCreated", "view", "app_debug"})
public final class MenuFragment extends androidx.fragment.app.Fragment implements com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter.Listener {
    private com.example.bahadir_eray_retrofitproject.databinding.FragmentMenuBinding _binding;
    private final com.example.bahadir_eray_retrofitproject.service.MarsAPIService marsAPIService = null;
    private java.util.ArrayList<com.example.bahadir_eray_retrofitproject.model.MarsModel> marsModel;
    private com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter recyclerViewAdapter;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    
    public MenuFragment() {
        super();
    }
    
    private final com.example.bahadir_eray_retrofitproject.databinding.FragmentMenuBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.bahadir_eray_retrofitproject.model.MarsModel marsModel) {
    }
    
    private final void getDataFromAPI() {
    }
}