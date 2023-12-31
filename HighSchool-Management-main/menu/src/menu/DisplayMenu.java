package menu;

import java.io.IOException;

import form.Forms;

public class DisplayMenu {

    public static void main(String[] args) throws IOException{
        // Create main menus
        Menu main = new Menu(null);
        Menu studentMenu = new Menu(main);
        Menu teacherMenu = new Menu(main);
        Menu courseMenu = new Menu(main);
        Menu classMenu = new Menu(main);
        Menu subjectsMenu = new Menu(main);
        Menu gradesMenu = new Menu(main);
        Menu scheduleMenu = new Menu(main);
        Menu editStudentMenu = new Menu(studentMenu);
        Menu fileMenu = new Menu(main);
        Menu açõesFileMenu = new Menu(fileMenu);

        // Add menu history

        // Create options for the main menu
        Action a1 = () -> studentMenu.build();
        MenuOption o1 = new MenuOption(main.getChoice(), "Aluno", new Executable(a1));
        main.addOption(o1);

        Action a2 = () -> teacherMenu.build();
        MenuOption o2 = new MenuOption(main.getChoice(), "Professor", new Executable(a2));
        main.addOption(o2);

        Action a3 = () -> courseMenu.build();
        MenuOption o3 = new MenuOption(main.getChoice(), "Curso", new Executable(a3));
        main.addOption(o3);

        Action a4 = () -> classMenu.build();
        MenuOption o4 = new MenuOption(main.getChoice(), "Turma", new Executable(a4));
        main.addOption(o4);

        Action a5 = () -> subjectsMenu.build();
        MenuOption o5 = new MenuOption(main.getChoice(), "Disciplina", new Executable(a5));
        main.addOption(o5);

        Action a6 = () -> gradesMenu.build();
        MenuOption o6 = new MenuOption(main.getChoice(), "Notas", new Executable(a6));
        main.addOption(o6);
        
        Action a7 = () -> fileMenu.build();
        MenuOption o7 = new MenuOption(main.getChoice(), "Ficheiro", new Executable(a7));
        main.addOption(o7);

        // Submenu options

        // Student submenu options
        Action a8 = () -> form.Forms.createStudentForm();
        MenuOption o8 = new MenuOption(studentMenu.getChoice(), "Criar Aluno e Inserir no Curso", new Executable(a8));
        studentMenu.addOption(o8);

        Action a9 = () -> Forms.viewStudentDetails(); 
        MenuOption o9 = new MenuOption(studentMenu.getChoice(), "Ver Detalhes do Aluno", new Executable(a9));
        studentMenu.addOption(o9);
        
        Action a20 = () -> editStudentMenu.build(); 
        MenuOption o20 = new MenuOption(studentMenu.getChoice(), "Editar Aluno", new Executable(a20));
        studentMenu.addOption(o20);
        
        Action a21 = () -> Forms.editStudentDetails("Name"); 
        MenuOption o21 = new MenuOption(studentMenu.getChoice(), "Alterar Nome", new Executable(a21));
        editStudentMenu.addOption(o21);
        
        Action a22 = () -> Forms.editStudentDetails("Gender"); 
        MenuOption o22 = new MenuOption(studentMenu.getChoice(), "Alterar Género", new Executable(a22));
        editStudentMenu.addOption(o22);
        
        Action a23 = () -> Forms.editStudentDetails("Birthday"); 
        MenuOption o23 = new MenuOption(studentMenu.getChoice(), "Alterar Data de Nascimento", new Executable(a23));
        editStudentMenu.addOption(o23);
        
        Action a24 = () -> Forms.editStudentDetails("Address"); 
        MenuOption o24 = new MenuOption(studentMenu.getChoice(), "Alterar Morada", new Executable(a24));
        editStudentMenu.addOption(o24);
        
        Action a25 = () -> Forms.editStudentDetails("EnrolledCourse and SchoolClass"); 
        MenuOption o25 = new MenuOption(studentMenu.getChoice(), "Alterar Curso e Turma", new Executable(a25));
        editStudentMenu.addOption(o25);

        // Teacher submenu options
        Action a10 = () -> Forms.createTeacherForm();; 
        MenuOption o10 = new MenuOption(teacherMenu.getChoice(), "Criar Professor e Inserir no Curso", new Executable(a10));
        teacherMenu.addOption(o10);

        Action a11 = () -> Forms.viewTeacherDetails(); 
        MenuOption o11 = new MenuOption(teacherMenu.getChoice(), "Ver Detalhes do Professor", new Executable(a11));
        teacherMenu.addOption(o11);

        // Course submenu options
        Action a12 = () -> Forms.viewCourseDetails(); 
        MenuOption o12 = new MenuOption(courseMenu.getChoice(), "Ver Detalhes do Curso", new Executable(a12));
        courseMenu.addOption(o12);

        // Class submenu options
        Action a13 = () -> Forms.viewClassDetails();
        MenuOption o13 = new MenuOption(classMenu.getChoice(), "Ver Detalhes da Turma", new Executable(a13));
        classMenu.addOption(o13);
        
        Action a14 = () -> scheduleMenu.build();
        MenuOption o14 = new MenuOption(classMenu.getChoice(), "Horário", new Executable(a14));
        classMenu.addOption(o14);
        
        // Schedule submenu options
        Action a15 = () -> Forms.createTimetableForm();
        MenuOption o15 = new MenuOption(scheduleMenu.getChoice(), "Criar Horário", new Executable(a15));
        scheduleMenu.addOption(o15);
        
        Action a16 = () -> Forms.viewTimetableDetails();;
        MenuOption o16 = new MenuOption(scheduleMenu.getChoice(), "Ver Horário", new Executable(a16));
        scheduleMenu.addOption(o16);

        // Subjects submenu options
        Action a17 = () -> Forms.viewSubjectDetails();
        MenuOption o17 = new MenuOption(subjectsMenu.getChoice(), "Ver Detalhes da Disciplina", new Executable(a17));
        subjectsMenu.addOption(o17);

        // Grades submenu options
        Action a18 = () -> System.out.println(".");
        MenuOption o18 = new MenuOption(gradesMenu.getChoice(), "Atribuir Nota", new Executable(a18));
        gradesMenu.addOption(o18);

        Action a19 = () -> System.out.println(".");
        MenuOption o19 = new MenuOption(gradesMenu.getChoice(), "Ver Nota", new Executable(a19));
        gradesMenu.addOption(o19);
        
        // File submenu options
        Action a26 = () -> form.Forms.readFile();
        MenuOption o26 = new MenuOption(fileMenu.getChoice(), "Opções de Ficheiros", new Executable(a26));
        fileMenu.addOption(o26);
        
        Action a27 = () -> form.Forms.readFile();
        MenuOption o27 = new MenuOption(açõesFileMenu.getChoice(), "Ler Ficheiro", new Executable(a27));
        açõesFileMenu.addOption(o27);
        
        Action a28 = () -> form.Forms.readFile();
        MenuOption o28 = new MenuOption(açõesFileMenu.getChoice(), "Reset Ficheiro", new Executable(a28));
        açõesFileMenu.addOption(o28);
     
        main.build();
    }
}
