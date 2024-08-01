package com.mybatis.project;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.mybatis.project.Template.getSqlSession;


public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDTO> getAllMenus() {
        SqlSession sqlSession = getSqlSession();

        /* 설명. sqlSession은 요청(Req) 단위로 생성해야 하기 때문에 getMapper() 메서드를 사용해
        *   로컬 스코프(메서드 스코프)로 매번 가져와야 한다.
        * */
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("이게안오는거임1?");
        List<MenuDTO> menuList = menuMapper.getAllMenus();
        System.out.println("이게안오는거임2?");

        sqlSession.close();

        return menuList;
    }

    public MenuDTO getMenuBy(int code) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        MenuDTO menu = menuMapper.getMenuBy(code);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int dmlResult = menuMapper.registMenu(menu);

        if(dmlResult > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return dmlResult > 0 ? true : false;
    }

    public boolean modifyMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int dmlResult = menuMapper.modifyMenu(menu);

        if(dmlResult > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return dmlResult > 0 ? true : false;

    }

    public boolean deleteMenu(int code) {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int dmlResult = menuMapper.deleteMenu(code);

        if(dmlResult > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return dmlResult > 0 ? true : false;
    }
}
