node {
    dir('src') { git url: "https://github.com/ros-industrial-consortium/descartes.git", branch: "melodic-devel" }
    registerROS('osrf/ros:noetic-desktop-full', ['ros-noetic-moveit-ros-planning'], [])
}
