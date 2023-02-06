package com.company;

public class OrderControl {

     System.out.println("Enter your choice from the menu");
            System.out.println("\n");
            System.out.println(" Menu ");
            System.out.println("1. Show task list");
            System.out.println("2. Add new task ");
            System.out.println("3. Edit task");
            System.out.println("4. Clear task list");
            System.out.println("5. Save to file");
            System.out.println("6. Quit application");


    menuInput = menu.nextLine();

            switch (menuInput) {
        case "1":
            System.out.println("Sort by 1. Date or 2. project, 0. exit");

            taskManager.sortDisplay(list, menu.nextLine());
            break;
        case "2":
            list = taskAdd(list);
            break;
        case "3":
            taskManager.editOption(list);
            break;
        case "4":
            list.removeAll(list);
            break;
        case "5":
            saveFile.arrayToOutput(list);
            break;
        case "6":
            menu.close();
            System.out.println("Thank you for using ToDoLy");
            return;
        default:
            System.out.println("You have entered invalid choice. Please try again");

    }
}
    }

public ArrayList taskAdd(ArrayList<Task> tasks) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("enter project: ");
        String project = userInput.nextLine();
        Scanner titleInput = new Scanner(System.in);
        System.out.println("enter title: ");
        String title = titleInput.nextLine();
        System.out.println("enter due date (dd/mm/yyyy) : ");

        Date dueDate = insertDate();

        Task task = new Task(project, title, dueDate);

        tasks.add(task);
        System.out.println(tasks.size());
        return tasks;
        }

        //create a command line project which practically can save the data and in the end publish the results of the control
}
