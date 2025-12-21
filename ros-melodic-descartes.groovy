node {
    git url: "https://github.com/ros-industrial-consortium/descartes.git", branch: "melodic-devel"
    registerROS('ros:melodic-desktop-full', ['ros-melodic-moveit-ros-planning', 'ros-melodic-moveit-kinematics'], ['ros-melodic-moveit-core'])
}
