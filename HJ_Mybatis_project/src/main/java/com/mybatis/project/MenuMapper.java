package com.mybatis.project;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> getAllMenus();

    MenuDTO getMenuBy(int code);

    int registMenu(MenuDTO menu);

    int modifyMenu(MenuDTO menu);

    int deleteMenu(int code);

}
