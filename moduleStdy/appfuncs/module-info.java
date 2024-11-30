module appfuncs {
    exports appfuncs.complicatedFuncs to appstart;
    exports appfuncs.simplefuncs;
    requires transitive appsupport;
}