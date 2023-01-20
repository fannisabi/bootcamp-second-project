package hu.ltk.core;

import hu.ltk.sabianfanni.init.InitProject;

public class CoreInitProject {
    private InitProject initProject = new InitProject();
    public String whoIsTheStorage() {
        return initProject.whoAmI();
    }
}
